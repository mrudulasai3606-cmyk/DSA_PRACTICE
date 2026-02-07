package Loops2;

import java.util.Scanner;

public class FirstMultipleOf5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            if((i%5==0) && (i%7==0)){
                System.out.println("First Multiple"+i);
                break;
            }
        }
    }
}
