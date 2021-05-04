package com.hg;

public class Customer {

    String id;
    int cost;
    int discount;
    int total;

    public Customer(String id, int cost, int discount, int total) {
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.total = total;
    }

    public void print() {

        System.out.println(id + "\t" + cost + "\t" + discount + "\t" + total);
    }
}
