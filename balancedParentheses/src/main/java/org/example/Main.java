package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "{[()]}";
//        for (String c : str.split(""))
//        System.out.println(c);
        balancedParentheses b = new balancedParentheses();
        if (b.isValid(str)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}