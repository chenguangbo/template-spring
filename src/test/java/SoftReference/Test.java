package SoftReference;

import java.lang.ref.SoftReference;


public class Test {

    public static void main(String[] args) {

        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]); // 10M
        System.out.println(softReference.get());
        System.gc();
        System.out.println(softReference.get());
        try{
            Thread.sleep(100);
        }catch (Throwable t){}
        System.out.println(softReference.get());

        byte[] bytes = new byte[1024 * 1024 * 12];
        System.out.println(softReference.get());
        // 软引用:当空间不够时,软引用指向的对象会优先被回收
    }


}
