package WakReference;

import java.lang.ref.WeakReference;

public class Test {

    public static void main(String[] args) {

        WeakReference<byte[]> weakReference = new WeakReference<>(new byte[1024]);
//        byte[] bytes = weakReference.get();
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
    }
}
