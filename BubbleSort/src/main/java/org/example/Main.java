package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] intArray = {-1, 5, 10,-20,22,44,5,-4};
        for (int lastIndex = intArray.length-1;lastIndex>0;lastIndex--){
            for(int i = 0;i<lastIndex;i++){
                if (intArray[i]>intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        System.out.print("Sorted array: [ ");
        for (int i =0;i<intArray.length;i++){
            System.out.print(intArray[i] +" ");
        }
        System.out.print("]");
    }
    public static void swap(int[] intArray,int i, int j){
        if (i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}