package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please intput numbers");
        long[] m = new long[5];
        for(int i = 0; i < 5; i++){
            m[i] = in.nextLong();
        }
        Arrays.sort(m);
        long x= 0;
        long y=0;
        for ( int i =0;i<4;i++){
            x+=m[i];
        }
        for (int i = 1;i<5;i++){
            y+=m[i];
        }
        System.out.println("Min sum is: "+x);
        System.out.println("Max sum is:"+y);
    }
}