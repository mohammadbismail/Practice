package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Create a menu program with the following options:
//    1. add elements
//    2. remove elements
//    3. print elements
//    4. exit\
    public static void displayMenu() {
        System.out.println();
        System.out.println(
                "1. add elements\n" +
                        "2. remove elements\n" +
                        "3. print elements\n" +
                        "4. exit"
        );
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            displayMenu();
            int selectOption = in.nextInt();
            if (selectOption == 1) {
                System.out.println("Enter an integer");
                int number = in.nextInt();
                list.add(number);
                System.out.println("Element added");
            } else if (selectOption == 2) {
                System.out.println("Enter an number to remove");
                int numRemove = in.nextInt();
                if (!list.contains(numRemove)) {
                    System.out.println(numRemove + " is not in the list");
                } else {
                    list.remove((Integer) numRemove);
                }
            } else if (selectOption == 3) {
                System.out.println(list);
            } else {
                break; // or return
            }
        }
    }
}