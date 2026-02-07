package arrays.java;

import java.util.Scanner;

public class arrq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int x = sc.nextInt();
        int i;
        int arr[] = new int[x];
        System.out.println("Enter elements into the array");
        for( i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for( i=0;i<arr.length;i++) {
            if (arr[i] < 35) {
                System.out.println(i);
            }
            else {
                System.out.println("Greater than 35");
            }
        }


    }
}
