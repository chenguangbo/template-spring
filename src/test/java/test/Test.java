package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        Hashtable<String, Object> hashtable = new Hashtable<>();
/*        hashtable.put(null,"");
        System.out.println(123);*/

        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("",null);
        System.out.println(concurrentHashMap);

    }

}
