package com.ideaTest.java;

import com.ideaTest.bean.Customer;

import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author rabbit-cs
 * @create 2020-07-05 23:16
 *
 * 1.IDEA中模板所处的位置：setting-Editor-live templates/postfix completion
 * 2.常用的模板
 */
public class TemplatesTest {
    //模板六： prsf：可生成private static final
    private static final Customer cut=new Customer();

    //变形：psf
    public static final int NUM=1;
    //变形 psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String NATION="china";

    //模板一 psvm
    public static void main(String[] args) {
        //模板二：
        System.out.println("hello!");
        //soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");//打印形参
        System.out.println("TemplatesTest.main");//打印方法

        int num1=10;
        System.out.println("num1 = " + num1);//就近选择变量打印出来
        int num2=10;
        System.out.println(num2);

        //模板三：fori
        String[] arr=new String[]{"Tom","Jerry","HanMeiMei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public void method(){
        System.out.println("TemplatesTest.method");
        //模板五：ifn
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);

        if (list == null) {

        }
        //变形 inn
        if (list != null) {

        }
        //变形：xxx.nn xx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
