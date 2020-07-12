package juc.segment;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *  CopyOnWriteArrayList/CopyOnWriteArraySet : "写入并复制"
 *  注意:添加操作多时,效率低,因为每次添加时都会进行复制,开销非常的大,
 *      适用场景:并发迭代操作多时可以选择
 */
public class TestCopyOnWriteArrayList {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add(""); // ReentrantLock  可重如锁控制

    }


}



