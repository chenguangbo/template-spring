package juc.readWriteLockDemo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReadWriteLock 读写锁
 * 写写/读写  需要锁
 * 读读 不需要锁
 */

public class ReadWriteLockDemo {

    public static void main(String[] args) {

        ReadWriteLockTest rw = new ReadWriteLockTest();
        new Thread(() -> {
            rw.get();
        }, "get").start();
    }
}

class ReadWriteLockTest {

    private int num = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    // 读
    public void get() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " : " + num);
        } finally {
            lock.readLock().unlock();
        }
    }

    // 写
    public void set(int num) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName());
            this.num = num;
        } finally {
            lock.writeLock().unlock();
        }
    }


}
