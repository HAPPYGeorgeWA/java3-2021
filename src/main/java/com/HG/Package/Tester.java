package com.HG.Package;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length: ");
        int length = scan.nextInt();
        System.out.println("Please enter width: ");
        int width = scan.nextInt();
        System.out.println("Please enter height: ");
        int height = scan.nextInt();
        System.out.println("length:"+length+" width: "+width+" height: "+height);
        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName());
        }




    }
}
