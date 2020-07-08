package locks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.openjdk.jol.info.ClassLayout;

/**
 * Created by ${陈广波} on 2020/6/7.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*Tick tick = new Tick();

        String classLayout = ClassLayout.parseClass(Tick.class).toPrintable();
        System.out.println(classLayout);

        System.out.println("==================");
        String s = ClassLayout.parseInstance(tick).toPrintable();
        System.out.println(s);*/

        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());

        short a = 1;
        System.out.println(a);

//        tick.call();
//        Tick tick2 = new Tick();
//        tick2.call();
/*        FutureTask ft = new FutureTask(tick);
        FutureTask ft2 = new FutureTask(tick);
        new Thread(ft).start();
        new Thread(ft2).start();*/

    }


}

class Tick implements Callable {

    private int ti = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public synchronized

    Object call() throws Exception {
        while (true) {
            lock.lock();
            if (ti > 0) {
                Thread.sleep(100);
                try {
                    System.out.println(Thread.currentThread() + " 当前余票 > " + ti--);
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
