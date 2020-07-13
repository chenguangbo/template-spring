package juc.productorAndConsumer.demo5;

public class TestProductAndConsumer {

    //  解决虚假唤醒问题
    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Productor productor = new Productor(clerk);
        Consumer consumer = new Consumer(clerk);
        new Thread(productor, "生产者 A").start();
        new Thread(consumer, "消费者 B").start();

        new Thread(productor, "生产者 C").start();
        new Thread(consumer, "消费者 D").start();
    }


}


class Clerk {

    private int product = 0;

    public synchronized void get() {

        while (product >= 1) { // 为了避免虚假唤醒问题,应该总是使用在循环中
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("产品已满");
        }
        System.out.println(Thread.currentThread().getName() + " : " + ++product);
        this.notifyAll();

    }

    public synchronized void sale() {
        while (product <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("缺货!");
        }
        System.out.println(Thread.currentThread().getName() + " : " + product--);
        this.notifyAll();

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

// 生产者
class Productor implements Runnable {
    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.get();
        }
    }
}




