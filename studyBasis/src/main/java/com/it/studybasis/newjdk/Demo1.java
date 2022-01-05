package com.it.studybasis.newjdk;

/**
 * @description: 匿名内部类 ————————>Lambda表示式
 * @author: Snail-bo
 * @create: 2022-01-05 19:52
 */
public class Demo1 {

    public static void test1(){
        //匿名内部类 写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        });
    }

    public static void test2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        });
    }

}
