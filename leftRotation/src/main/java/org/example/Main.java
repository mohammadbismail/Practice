package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> rotateLeft(int d, List<Integer> array){
        List<Integer> list = new ArrayList<>();
        for (int i = d; i < array.size();i++){
            list.add(array.get(i));
        }
        for (int i = 0; i < d ; i++){
            list.add(array.get(i));
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println(rotateLeft(2,list));;
     }
}