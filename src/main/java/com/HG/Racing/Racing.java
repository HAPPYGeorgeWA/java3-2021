package com.HG.Racing;

public class Racing {
    public static void main(String[] args) {
        String name1 = "Horse1";
        Horse h2 = new Horse();
        h2.start();
        for (int i = 0; i <10000 ; i++) {
            System.out.println("Horse1"+" "+i);
        }
    }
}
