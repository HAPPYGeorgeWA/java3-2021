package com.anon;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            public void print(){
                System.out.println("Ding dong");
            }
        };
        Reporter reporter1 = new Reporter() {
            public void print(){
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter1.print();
        System.out.println(" ");
        //

        Reporter reporter2 = new HeheheReporter();
        Reporter reporter3 = new WeatherReporter();

        reporter2.print();
        reporter3.print();



    }
}
