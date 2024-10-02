package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        int l = 100; 

        MioThread t1 = new MioThread(l);
        MioThread t2 = new MioThread(l);
        MioThread t3 = new MioThread(l);
        MioThread t4 = new MioThread(l);
        MioThread t5 = new MioThread(l);
        MioThread t6 = new MioThread(l);
        MioThread t7 = new MioThread(l);
        MioThread t8 = new MioThread(l);
        MioThread t9 = new MioThread(l);
        MioThread t10 = new MioThread(l);

        t1.setName("cavallo1");
        t2.setName("cavallo2");
        t3.setName("cavallo3");
        t4.setName("cavallo4");
        t5.setName("cavallo5");
        t6.setName("cavallo6");
        t7.setName("cavallo7");
        t8.setName("cavallo8");
        t9.setName("cavallo9");
        t10.setName("cavallo10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        
        
    }
}