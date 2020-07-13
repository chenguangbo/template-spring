package juc.callableDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable {

    public static void main(String[] args){

        CallableDemo demo = new CallableDemo();
        FutureTask<Integer> result = new FutureTask<>(demo);
        new Thread(result).start();
        try {
            Integer integer = result.get();
            System.out.println("----------------");
            System.out.println(integer);
            System.out.println(Integer.MAX_VALUE);
            System.out.println("----------------");
        }catch (Throwable t){
            t.printStackTrace();
        }
    }

}

class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        return sum;
    }


}
