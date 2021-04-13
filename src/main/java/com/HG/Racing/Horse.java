package com.HG.Racing;

public class Horse extends Thread{

   //Ctrl + o
   @Override
    public void run() {
            for (int i = 0; i <10000 ; i++) {
            System.out.println(getName()+i);//getName是系統預設的名字
        }
    }
}
