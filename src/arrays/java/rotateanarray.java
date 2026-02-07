package arrays.java;

import java.util.Scanner;

public class rotateanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {70,56,734,56,12,60};
        int k =sc.nextInt();
        int n= arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.println(ele);
        }

    }
    public static void reverse(int arr[],int i, int j){
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
