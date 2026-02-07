package Loops2;

import java.util.Scanner;

public class Combination {
    public static int fact(int x){
        int ft =1;
        for(int i=1;i<=x;i++){
            ft *= i;
        }
        return ft;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

            int ncr = fact(a) / (fact(b) * fact(a - b));
            System.out.println(ncr);
        }
}
