package com.HG.Package;

public class Package {
    int length;
    int width;
    int height;

   public Boolean validate(int a,int b,int c){
       return (a<=length && b<=width && c<=height);
   }





}
