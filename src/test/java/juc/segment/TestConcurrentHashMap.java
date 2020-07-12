package juc.segment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *  ConcurrentSkipListMap 通常由于同步的TreeMap
 *  当期望的读数和遍历远远大于列表更新数时,CopyOnWriteArrayList优于ArrayList
 */
public class TestConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<Object, Object> hashMap = new ConcurrentHashMap<>();
        ConcurrentSkipListMap<String,Object> sc = new ConcurrentSkipListMap<>();
        // 此方法没有并发修改异常
        CopyOnWriteArrayList<String> cw = new CopyOnWriteArrayList();
        cw.add("aaa");
        CopyOnWriteArraySet<String> cs = new CopyOnWriteArraySet();

        // 此方法有并发修改异常
        List<String> list = Collections.synchronizedList(new ArrayList<String>());



    }

}
