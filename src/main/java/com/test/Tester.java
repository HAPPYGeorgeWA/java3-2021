package com.test;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Box[] boxes = {
                new Box1(), new Box2(), new Box3(), new Box4(), new Box5()
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object's length: ");
        int length = scan.nextInt();
        System.out.println("Please enter object's width: ");
        int width = scan.nextInt();
        System.out.println("Please enter object's width: ");
        int height = scan.nextInt();

        for (Box box : boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.name + " it is! ," + box.price);
                break;
            }

        }
    }
}
