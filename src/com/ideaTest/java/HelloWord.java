package com.ideaTest.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWord {

    private static int num;
    private static final int INITAL_SIZE=10;
    public static void main(String[] args){
        getlist();
        Date date = new Date();

        method();
    }

    public static void getlist() {
        //region Description
        System.out.println("Hello Word");
        System.out.println("Hello Word!!!!");
        //endregion

        ArrayList list = new ArrayList();

        list.add(3);
    }

    public static void method(){

        num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
