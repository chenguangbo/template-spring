package juc.volatileDemo;

import lombok.SneakyThrows;


/**
 * java 源码                  volatile
 * ByteCode字节码             Access_volatile
 * JVM虚拟机规范              JVM内存屏障
 * Hotspot                    lock_compare
 * CPU                        总线锁
 */

public class Demo {

    private static String str = "A";

    @SneakyThrows
    public static void main(String[] args) {


        System.out.println(str);
        m1();
        Thread.sleep(100);
        System.out.println(str);
    }

    public static void m1() {
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                str = "b";
                System.out.println(str);

            }
        }).start();
    }

}
