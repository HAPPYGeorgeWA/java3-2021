package com.HG.cust;

public class Tester {
    public static void main(String[] args) {
    Customer customer = new Customer("0001",900);

    System.out.println(customer.id+"\t"+customer.amount+"\t"+customer.getTotal());

    SilverCustomer AmeliaWatson = new SilverCustomer("AmeliaWatson",9000);

    System.out.println(AmeliaWatson.id+"\t"+AmeliaWatson.amount+"\t"+AmeliaWatson.getTotal());
    }
}
