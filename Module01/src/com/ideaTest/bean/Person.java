package com.ideaTest.bean;

/**
 * @author rabbit-cs
 * @create 2020-07-05 23:05
 */
public class Person extends Customer{
    @Override
    public void eat() {
        System.out.println("客户吃饭");
    }
}
