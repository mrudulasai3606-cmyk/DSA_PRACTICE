package arrays.java;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter elements into the array:");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        int x = sc.nextInt();
        for(i=0;i<a.length;i++){
            if(a[i]==x) {
                System.out.println("Found");
                break;
            }
            else{
                System.out.println("Not found");
                break;
            }

        }
    }
}
