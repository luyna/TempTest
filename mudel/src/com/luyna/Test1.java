package com.luyna;

/**
 * Created by Luyna on 2016/7/17.
 */
public class Test1 {
    private String name;

    public Test1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test1 ha = new Test1("luyna123");
        System.out.println(ha.toString());
    }
}
