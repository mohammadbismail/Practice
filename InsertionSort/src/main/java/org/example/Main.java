package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,-5,40,10,-24,3,15};

        for (int firstUnsortedIndex = 1;firstUnsortedIndex < arr.length;firstUnsortedIndex++){
            int element = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i>0 && arr[i-1]> element;i--  ){
                // shift left - right --->
                arr[i] = arr[i-1];
            }
            arr[i] = element;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}