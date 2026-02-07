package Recursion;

public class PrintArray {
    public static void Print(int arr[]){
        int i = 0 ;
        if(arr[i]==arr.length)
            return;
        System.out.println(arr[i]);
       // Print(arr[i+1]);
    }

    public static void main(String[] args) {

    }
}
