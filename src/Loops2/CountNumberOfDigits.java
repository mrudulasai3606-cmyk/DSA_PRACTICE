package Loops2;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod =0;
        while(n>0){
            n = n/10;
            nod++;
        }
        System.out.println(nod);
    }
}
