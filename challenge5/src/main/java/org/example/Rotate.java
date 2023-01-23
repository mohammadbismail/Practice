package org.example;

public class Rotate {
    int[] arr = new int[5];

    public void rotateLeft(int d, int[] arr) {
        int[] newArr = new int[5];
        for(int i = 0;i<arr.length;i++){
//        newArr[i]= arr[i+d-1];
        }
        for ( int i = 0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");

        }
    }
}