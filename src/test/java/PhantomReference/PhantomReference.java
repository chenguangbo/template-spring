package PhantomReference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

public class PhantomReference {

    private static final List<Object> LIST = new LinkedList<>();
    private static final ReferenceQueue<PhantomReference> QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) {

        java.lang.ref.PhantomReference<PhantomReference> referencePhantomReference = new java.lang.ref.PhantomReference<>(new PhantomReference(), QUEUE);

        System.out.println(referencePhantomReference.get());


        new Thread(() -> {
            while (true) {
                LIST.add(new byte[1024 * 1024]);
                try{
                    Thread.sleep(1000);
                }catch (Throwable t){
                    t.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                System.out.println(referencePhantomReference.get());
            }
        }).start();


        new Thread(()->{
            while (true){
                Reference poll = QUEUE.poll();
                if (poll!=null){
                    System.out.println("对象被回收了---" + poll);
                }
            }

        }).start();



    }


}
