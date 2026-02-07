package arrays.java;

public class reverse {
    public static void main(String[] args) {
       int arr[] = {23,45,56,67,78,94,97};
       int n = arr.length;
       for(int i=0; i<n/2;i++){
           int j = n-1-i;
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       for(int ele: arr){
           System.out.println(ele);
       }
    }
}
