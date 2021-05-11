package com.pg;

import java.util.TreeSet;

public class TreeSetTester {
    public static void main(String[] args) {
        TreeSet<Integer> aa = new TreeSet<>();
        aa.add(5);
        aa.add(4);
        aa.add(6);
        aa.add(9);
        aa.add(5);
        aa.add(9);
        aa.add(1);
        System.out.println(aa.size());
        System.out.println(aa);
        for (Integer g : aa) {
            System.out.println(g);
        }

        TreeSet<String> bb = new TreeSet<>();
        bb.add("Ame");
        bb.add("Ina");
        bb.add("Gura");


        for (String s : bb) {
            System.out.println(s);
        }
    }
}