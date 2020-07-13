package juc.productorAndConsumer;

public class TestProductAndConsumer {



}


class Clerk{

    private int product = 0;

    public synchronized void  get(){

        if (product>=10){
            System.out.println("产品已满");
        }else {
            System.out.println(Thread.currentThread().getName() + " : " + ++product);
        }
    }

    public synchronized void sale(){
        if (product<=0){
            System.out.println("缺货!");
        }else {
            System.out.println(Thread.currentThread().getName()+" : " + --product);
        }
    }



}




