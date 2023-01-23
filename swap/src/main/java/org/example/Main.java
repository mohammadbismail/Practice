package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        //method 1
//        x = (x*y) / (y=x);
        // method 2
        x = x *y; // 50
        y = x/y; // 50/10 = 5
        x = x/y; // 50/5 = 10
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}