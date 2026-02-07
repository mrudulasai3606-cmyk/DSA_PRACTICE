package Arrays2;

import java.util.Scanner;

public class LinearSearch {
    public static void display(int arr[]){

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter elements into the array:");
        for (int i = 0; i < x; i++) {
            arr[i] =  sc.nextInt();
        }
        System.out.println("Enter an element to search:");
        int search = sc.nextInt();
        int flag=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==search){
                flag =1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        display(arr);
    }
}
