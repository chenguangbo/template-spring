package juc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 一.线程池:提供了一个线程队列,队列中保存者所有等待状态的线程.避免了创建与销毁额外开销,提个了响应速度.
 *
 * 二.线程池的体系结构:
 *  java.util.concurrent.Executor    : 负责线程的使用与调度的根接口
 *      |--**ExecutorService  子接口 : 线程池的主要接口
 *          |--ThreadPoolExecutor  线程池的实现类
 *          |--ScheduleExecutorService 子接口:负责线程的调度 定时执行
 *              |--ScheduleThreadPoolExecutor : 继承ThreadPoolExecutor,实现ScheduleExecutorService
 *
 * 三.工具类 : Executors
 * ExecutorService newFixedThreadPool() : 创建固定大小的线程池
 * ExecutorService newCachedThreadPool() : 缓存线程池,线程池的数量不固定,可以根据需求自动的更改数量
 * ExecutorService newSingleThreadExecutor() : 创建单个线程池.线程池中的只有一个线程
 *
 * ScheduleExecutorService newScheduleThreadPool() : 创建固定大小的线程,可以延迟或定时的执行任务  .
 *
 */



public class Test {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit()
//        ThreadPoolExecutor


    }


}
