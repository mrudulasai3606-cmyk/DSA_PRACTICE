package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackImplUsingArrays {
    public static class Stack{
      private   int arr[] = new int[5];
      private int idx =  0;
       public boolean isEmpty(){
           if(idx==0) {
               System.out.println("Stack is empty");
               return true;
           }
           return false;
       }
       public boolean isFull(){

           if(idx== arr.length){
               System.out.println("Stack is full");
               return true;
           }
           return false;
       }
       public void push(int x){
           if(isFull()) {
               System.out.println("Stack Overflow");
           }
           arr[idx] = x;
           idx++;
       }
       public int pop(){
           if(isEmpty()){
               System.out.println("Stack UnderFlow");
               return -1;
           }
           int top = arr[idx-1];
           arr[idx-1] =0;
           idx--;
           return top;
       }
       public void peek(){
           System.out.println(arr[idx-1]);
       }
       public void display(){
           for(int i=0;i<idx;i++){
               System.out.print(arr[i]+" ");
           }
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);//10
        st.push(20);//10 20
        st.push(30);// 10 20 30
        st.push(50);//10 20 30 50
        st.display();
        st.pop();// 10 20 30
        System.out.println();
        st.display();
        System.out.println();
        st.peek();

    }
}
