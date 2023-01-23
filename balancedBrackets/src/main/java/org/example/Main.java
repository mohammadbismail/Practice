package org.example;

import java.util.Stack;

public class Main {
    public static String isBalanced(String s) {
//        char[] charArr = s.toCharArray();
//        Stack<Character> myStack = new Stack();
//        if (charArr[0] == ')' || charArr[0] == ']' || charArr[0] == '}'){
//            return "NO";
//        }
//        for (Character c: charArr){
//            if (c == '(' || c == '[' || c == '{'){
//                myStack.push(c);
//                continue;
//            }
//            if (c == ')' && myStack.peek() == '(' || c == ']' && myStack.peek() == '[' || c == '}' && myStack.peek() == '{'){
//                myStack.pop();
//            }
//        }
//        if (myStack.isEmpty()){
//            return "YES";
//        }
//        else {
//            return "NO";
//        }
        Stack<Character> stack1 = new Stack<>();
        char[] charArr = s.toCharArray();
        if (s.length() %2 != 0) return "NO";
        stack1.push('a'); // weather stack is clear or full, like an indicator
        for(Character c : charArr){
            if((c == '}' && stack1.peek() == '{') || (c == ']' && stack1.peek() == '[') || (c == ')' && stack1.peek() == '(' )){
                stack1.pop();
            }
            else stack1.push(c);
        };
        if(stack1.peek() == 'a') return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        String s = "{(([])[])[]]}";
        System.out.println(isBalanced(s));

    }
}