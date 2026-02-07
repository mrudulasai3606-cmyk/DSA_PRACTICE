package Loops2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter operation +,-,%,/,*.");
//        char ch = sc.next().trim().charAt(0);
        while (true){
            System.out.println("Enter operation +,-,%,/,*.");
            char ch = sc.next().trim().charAt(0);
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(ch=='+' || ch== '-'|| ch=='%' || ch=='/'|| ch=='*'){
                if(ch=='+'){
                    System.out.println(a+b);
                }
                if(ch=='-'){
                    System.out.println(a-b);
                }
                if(ch=='*'){
                    System.out.println(a*b);
                }
                if(ch=='/')
                    System.out.println(a/b);
                if(ch=='%')
                    System.out.println(a%b);
            }
            else if(ch=='X'|| ch=='x'){
                break;
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
