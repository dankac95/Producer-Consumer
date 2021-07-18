package zadanie1;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Printer implements Callable<Void> {

    private String letter;
    private int numberOfPrints;
    private int timeInterval;
    private int realCount = 0;
    private volatile boolean running = true;

    public Printer(String letter, int numberOfPrints, int timeInterval) {
        this.letter = letter;
        this.numberOfPrints = numberOfPrints;
        this.timeInterval = timeInterval;
    }

    public void stopRunning() {
        running = false;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "letter='" + letter + '\'' +
                ", numberOfPrints=" + numberOfPrints +
                ", timeInterval=" + timeInterval +
                '}';
    }

    @Override
    public Void call() {
        for (int i = 0; running && i < numberOfPrints; i++) {
            System.out.println(letter);
            realCount++;
            try {
                TimeUnit.SECONDS.sleep(timeInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public int getRealCount() {
        return realCount;
    }

    public String getLetter() {
        return letter;
    }
}
