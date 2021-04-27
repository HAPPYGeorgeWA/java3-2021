package com.test;

public class Tester {
    public static void main(String[] args) {

        Box[] boxes ={new Box1(),new Box2(),new Box3(),new Box4(),new Box5()};

        int length = 20;
        int width = 20;
        int height =20;

        for (Box box:boxes){
            if (box.validate(length,width,height)){
                System.out.println(box.name+" it is! ,"+box.price);
                break;
        }

        }
    }
}
