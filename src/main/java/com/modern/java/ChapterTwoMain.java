package com.modern.java;


import java.sql.SQLOutput;

public class ChapterTwoMain {


    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        t.run();

    }


}
