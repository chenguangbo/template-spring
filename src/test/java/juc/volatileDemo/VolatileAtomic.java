package juc.volatileDemo;


/*
1.保证可见性
2.不保证原子性
    不可分割,完整性,也即某个线程正在做某个具体业务时,中间不可以被加塞或者被分割.需要整体完整
    要么成功,要么失败


 */

public class VolatileAtomic {
    // volatile 不保证原子性
    public static void main(String[] args) throws InterruptedException {

        InnerClass innerClass = new InnerClass();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    innerClass.add();
                }
            }).start();
        }
        System.out.println("__" + innerClass.a);
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

    }
}


class InnerClass {
    volatile int a = 0;

    public void add() {
        // 因为 a++ 有 1.读  2.改  3.写  操作   volatile 只能保证内存可见性  不能保证原子性
        a++;
    }

}
