package map;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new byte[90024]);
            }
        } catch (Throwable t) {
            int size = list.size();
            System.out.println("size : " + size);
            t.printStackTrace();
        }
        int a = 0;
        while (true) {
            System.out.println(a++);
            Thread.sleep(1000L);
        }

    }


}
