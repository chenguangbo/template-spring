package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {

        ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        ConcurrentHashMap<String, Object> con = new ConcurrentHashMap<>();
        ThreadLocal threadLocal= new ThreadLocal<String>();
        threadLocal.set(1);
        System.out.println(queue.toString());

    }

}
