package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        arrayOfN newArr = new arrayOfN();

        Scanner obj = new Scanner(System.in);
        System.out.println("Please input value");
        String num = obj.nextLine();
        Integer objNum = Integer.valueOf(num);
        newArr.printList(objNum);
    }
}
