package Loops2;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int rev =0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n = n/10;
        }
        if(rev==temp){
            System.out.println("Palin");
        }
        else
            System.out.println("Not");
        System.out.println(rev);
    }
}
