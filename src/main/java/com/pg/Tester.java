package com.pg;

import com.test.Box;
import com.test.Box1;
import com.test.Box2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {
        TreeSet <Integer> aa= new TreeSet<>();
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

        TreeSet <String> bb= new TreeSet<>();
        bb.add("Ame");
        bb.add("Ina");
        bb.add("Gura");


        for (String s : bb) {
            System.out.println(s);
        }
       /* int[] num= new int[5];
        num[0]=5;


        ArrayList list = new ArrayList();

        list.add("AME");

        list.add(123);

        list.add(true);
        Box1 box = new Box1();
        list.add(box);

        String name = (String) list.get(0);
        String kk = (String) list.get(1);
        //
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);

        Box b = boxes.get(0);*/


    }
}
