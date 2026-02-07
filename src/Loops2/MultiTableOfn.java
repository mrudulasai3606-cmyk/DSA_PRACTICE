package Loops2;

import java.util.Scanner;

public class MultiTableOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i=i+n){
            System.out.println(i);
        }
    }
}
