package com.cgb.springboot.compare;

/**
 * Created on 2020/9/10.
 */
public class Test {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }


}
