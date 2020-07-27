package map;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.collections4.MapUtils;

public class TestConcurrentSkipListMap {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        Hashtable<String,Object> xxx = new Hashtable<>();

        BigInteger add = BigInteger.ZERO.add(BigInteger.valueOf(1232131312));
        System.out.println(add);
        long round = Math.round(-11.5);
        System.out.println(round);
        System.out.println( ">>:" +Integer.MAX_VALUE + Integer.MAX_VALUE);
        byte aaa;
        short bbb;
        int ccc;
        long ddd;
        float fff;
        double ggg;
        boolean vvv;
        char mmm;
        short aa = 1;
        aa = (short) (aa + 1);

        ConcurrentSkipListMap<String, Object> skipListMap = new ConcurrentSkipListMap();
        skipListMap.put("123", "123");
        Integer integer = MapUtils.getInteger(skipListMap, "123");
        System.out.println(integer);
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("", "");
//        Collections
//        Integer anInt = MapUtil.getInt(skipListMap, 123);
//        System.out.println(anInt);
//        Maps.asMap()
    }


}
