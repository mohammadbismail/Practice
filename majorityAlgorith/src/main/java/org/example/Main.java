package org.example;

public class Main {
    //Moore's Voting Algorithm
//    public static int majorityElement(int[] arrayOfNums) {
//        int count = 0;
//        int candidate = 0;
//        for (int num : arrayOfNums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        System.out.println("Majority element is: " + candidate);
//        return candidate;
//    }

    public static int majorityElement(int[] numsArr) {
        int count = 0;
        int candidate = 0;
        for (int num : numsArr) {
            // check two conditions for each iteration, once count is zero that means count of majority == count of min
            // since they cancelled each other
            if (count == 0) {
                candidate = num;
            }
            // if this number equals candidate count ++
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority element is: " + candidate);
        return candidate;

    }

    public static void main(String[] args) {
        int[] arrayOfNums = {1, 4, 4, 4, 3, 4, 0, 4};
        majorityElement(arrayOfNums);
    }
}