package juc.volatileDemo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class VolatileInt {

    /*
    1.volatile保证内存可见性
    2.CAS 算法保证数据的原子性
      CAS 算法是硬件对于并发操作共享数据的支持
      UNSAFE native  保证cas
     */
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        ai.getAndAdd(1);
        ai.compareAndSet(1,2);

        AtomicReference af = new AtomicReference();


    }

}
