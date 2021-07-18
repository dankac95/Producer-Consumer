package zdanie3;

import zdanie3.model.JobOffer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private final BlockingQueue<JobOffer> offersQueue;

    public Consumer(BlockingQueue<JobOffer> offersQueue) {
        this.offersQueue = offersQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                JobOffer offer = offersQueue.take();
                System.out.println(offer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
