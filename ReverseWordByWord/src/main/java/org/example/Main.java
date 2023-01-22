package org.example;

public class Main {
    public static String reverse(String s) {
        String[] splitArray = s.split(" ");
        String temp;
        String finalText = "";
        for (int i = 0, j = splitArray.length - 1; i < splitArray.length / 2; i++, j--) {
            temp = splitArray[i];
            splitArray[i] = splitArray[j];
            splitArray[j] = temp;
        }
        for (int i = 0; i < splitArray.length; i++) {
            finalText += splitArray[i] + " ";
        }
        return finalText;
    }

    public static String reverse2(String s) {
        String[] words = s.split("\\s");
        String outputString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            outputString += words[i] + " ";
        }
        return outputString;
    }

    public static void main(String[] args) {
        String s = "I love when sky is blue.";
        System.out.println(reverse(s));
        System.out.println(reverse2(s));
    }
}