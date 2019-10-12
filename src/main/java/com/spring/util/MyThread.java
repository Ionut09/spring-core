package com.spring.util;

import java.util.HashMap;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        System.out.println(Thread.currentThread().getName());
        x.start();


        //Given:

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(3, "d");
        hm.put(3, "e");
        hm.forEach((key, value) -> System.out.println(key + "~" + value));
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "..");
        }
    }
}
