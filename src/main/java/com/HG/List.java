package com.HG;

public class List {
    public static void main(String[] args) {
        Customer cus1 = new Customer("0013", 490, 0, 490);
        cus1.print();
        Customer cus2 = new Customer("0052", 1000, 100, 900);
        cus2.print();
        Customer cus3 = new Customer("0081", 290, 0, 290);
        cus3.print();
        Customer cus4 = new Customer("2122", 2000, 200, 1800);
        cus4.print();
    }
}
