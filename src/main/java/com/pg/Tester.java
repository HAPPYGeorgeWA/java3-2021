package com.pg;

import com.test.Box1;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int[] nums= new int[5];
        nums[0]=5;
        Integer n =123;



        ArrayList list = new ArrayList();
        list.add("AME");
        list.add("Ina");
        list.add("Gura");

        list.add(123);
        list.add(true);
        Box1 box = new Box1();
        list.add(box);
    }
}
