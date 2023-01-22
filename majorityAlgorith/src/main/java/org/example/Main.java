package org.example;

public class Main {
    //Moore's Voting Algorithm
    public static int majorityElement(int[] arrayOfNums) {
        int count = 0;
        int element = 0;
        for (int num : arrayOfNums) {
            if (count == 0) {
                element = num;
            }
            if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arrayOfNums = {4, 4, 1, 4, 4, 3, 4, 0};
        System.out.println(majorityElement(arrayOfNums));
    }
}