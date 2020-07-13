package juc.productorAndConsumer;

public class TestProductAndConsumer {


    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Productor productor = new Productor(clerk);
        Consumer consumer = new Consumer(clerk);
        new Thread(productor, "生产者 A").start();
        new Thread(consumer, "消费者 B").start();
    }


}


class Clerk {

    private int product = 0;

    public synchronized void get() {

        if (product >= 10) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("产品已满");
        } else {
            System.out.println(Thread.currentThread().getName() + " : " + ++product);
            this.notifyAll();
        }
    }

    public synchronized void sale() {
        if (product <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("缺货!");
        } else {
            System.out.println(Thread.currentThread().getName() + " : " + product--);
            this.notifyAll();
        }
    }

}

// 消费者
class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.sale();
        }
    }
}

class Productor implements Runnable {
    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.get();
        }
    }
}




