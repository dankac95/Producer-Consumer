package zdanie3;

import zdanie3.model.JobOffer;

import java.util.concurrent.*;

public class StartApp {

    public static void main(String[] args) {

        ScheduledExecutorService schedulingExecutor = Executors.newScheduledThreadPool(1);
        BlockingQueue<JobOffer> queue = new LinkedBlockingQueue<>();

        Consumer consumer = new Consumer(queue);
        Producer jjitProducer = new Producer(queue);

        schedulingExecutor.scheduleWithFixedDelay(jjitProducer, 0, 1, TimeUnit.SECONDS);

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
    }
}
