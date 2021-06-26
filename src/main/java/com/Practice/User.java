package com.Practice;

public class User {
    private String name;
    private String account;
    private int password;
    private double balance;


   public User(String name,String account, int password,  double balance) {
       this.name = name;
        this.password = password;
        this.account = account;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPassword(){
        return password;
    }

    public void setPassword(int password){
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

}
