package map;

import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.collections4.MapUtils;

public class TestConcurrentSkipListMap {

    public static void main(String[] args) {

        ConcurrentSkipListMap<String,Object> skipListMap = new ConcurrentSkipListMap();
        skipListMap.put("123","123");
        Integer integer = MapUtils.getInteger(skipListMap, "123");
        System.out.println(integer);
//        Integer anInt = MapUtil.getInt(skipListMap, 123);
//        System.out.println(anInt);
//        Maps.asMap()
    }


}
