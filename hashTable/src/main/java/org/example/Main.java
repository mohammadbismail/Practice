package org.example;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;


public class Main {

    public static void main(String[] args) {

    Hashtable<String,Integer> ht = new java.util.Hashtable<>();
        ht.put("ll1",5);
        ht.put("ll2",5);
        ht.put("ll3",5);
        ht.put("ll4",5);
        values = ht.keys();
       while(values.hasMoreElements()){
           String str = (String) values.nextElement();
           System.out.println(values.get(str));
       }


    }
}