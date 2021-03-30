package com.HG.Package;

public class Box3 extends Package {
    public Box3() {

        int length = 10;
        int width = 10;
        int height = 10;
    }

    @Override
    public String getName(){
        return "Box3";

    }
    @Override
    public String getPrice(){
        return 60;
    }


}