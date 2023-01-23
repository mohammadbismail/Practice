package org.example;

import java.util.Stack;

public class balancedParentheses {
    public boolean isValid(String str){
        if (str.length() % 2 != 0) return false;
        // stack to hold characters
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            // forEach loop is checking character before adding to Stack yet
            else if(c == '}' && !stack.isEmpty() && stack.peek() =='{'){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() =='['){
                stack.pop();
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() =='('){
                stack.pop();
            }
        }
        return stack.isEmpty();
//        or
//        if (stack.isEmpty()){
//            return true;
//        }
//        else{
//            return false;
//        }
    }
    
}
