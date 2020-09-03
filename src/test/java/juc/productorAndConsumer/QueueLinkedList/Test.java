package juc.productorAndConsumer.QueueLinkedList;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {

    public static void main(String[] args) {
        BlockingQueue sharedQueue = new LinkedBlockingQueue(10);
        Thread c1 = new Thread(new Consumer(sharedQueue));
        Thread p1 = new Thread(new Producer(sharedQueue));

        c1.start();
        p1.start();

        System.out.println(456);



        System.out.println(123);

    }

}

class Consumer implements Runnable {
    private BlockingQueue  queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("生产者生产了第" + i + "个商品");
            queue.add(i);
        }
    }

}

class Producer implements Runnable {
    private BlockingQueue  queue;

    public Producer(BlockingQueue  queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}