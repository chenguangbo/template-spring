package juc.CountDownLatchDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import com.google.common.base.Stopwatch;

/**
 * CountDownLatch  : 闭锁,在完成某些运算,只有其他所有线程的运算全部完成,当前运算才继续执行
 */
public class TestCountDownLatch {

    public static void main(String[] args) {
//        CyclicBarrier
//        Semaphore
//        CyclicBarrier
//        BlockingQueue
//        ReentrantLock
//                这能不用cas做这的判断吗,就是不用AtomicInteger,还能用什么方法实现
//        Thread
        final CountDownLatch latch = new CountDownLatch(10);
        Stopwatch stopwatch = Stopwatch.createStarted();
        LatchDemo latchDemo = new LatchDemo(latch);
        for (int i = 0; i <10 ; i++) {
            new Thread(latchDemo).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long elapsed = stopwatch.elapsed(TimeUnit.NANOSECONDS);
        System.out.println(elapsed);
    }
}
class LatchDemo implements Runnable {

    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        for (int i = 0; i <10000 ; i++) {
//            System.out.println(i);
        }
        latch.countDown();
    }
}