package juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.SneakyThrows;

/**
 * 用于解决多线程安全问题的方式
 * synchronized
 * 1.同步代码块
 * 2.同步方法
 * 3.jdk 1.5  后:
 * 显示锁
 * 同步锁Lock
 * 注意:是一个显示锁,需要通过lock(),方法里面上锁,必须通过unlock()方法释放锁
 * 更加灵活更加安全的方式上锁   非公平锁  公平锁  是可控的
 */
public class TestLock {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        new Thread(ticket, "1-->").start();
        new Thread(ticket, "2-->").start();
        new Thread(ticket, "3-->").start();


    }
}


class Ticket implements Runnable {

    int a = 100;

    private Lock lock = new ReentrantLock();

    @SneakyThrows
    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();
                if (a > 0) {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+ " " + --a);
                }
            } catch (Throwable t) {
                t.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
