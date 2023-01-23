package org.example;

import java.util.ArrayList;

public class arrayOfN {

    public void printList(Integer objNum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < objNum; i++) {
            list.add(i);
        }
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
