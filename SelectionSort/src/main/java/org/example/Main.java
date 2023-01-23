package org.example;

public class Main {

    public static void swap(int[] intArray, int i,int j){
        if (i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
    public static void main(String[] args) {
        int[] intArray = {1,5,20,-4,44,50,-1};
        // outer loop for swapped numbers
        for ( int lastUnsortedIndex= intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest= 0;
            for (int i= 1;i<=lastUnsortedIndex;i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }
        for (int i = 0;i < intArray.length-1;i++) System.out.println(intArray[i]);
    }
}