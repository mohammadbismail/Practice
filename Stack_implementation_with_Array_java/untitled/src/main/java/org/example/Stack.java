package org.example;
import java.util.*;
public class Stack {
    int top;
    int maxSize = 5;
    int[] stack_arr = new int[maxSize];
    public Stack(){
        top = -1;
    }
    boolean isEmpty(){
        return (top<0);
    }
    void push(int val){
        if (top == maxSize-1){
            System.out.println("Stack is Full!");
        }
        else {
            top++;
            stack_arr[top] = val;
        }
    }
    void pop(){
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            top--;
        }
    }
    void display(){
        for(int i = top ; i>=0; i--){
            System.out.print(stack_arr[i]+" ");
        }
    }
}
