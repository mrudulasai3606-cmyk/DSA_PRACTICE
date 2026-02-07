package Basics;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        while(y!=0){
            int rem = x%y;
            x = rem;
            y = x;
        }
        System.out.println(y);
    }
}
