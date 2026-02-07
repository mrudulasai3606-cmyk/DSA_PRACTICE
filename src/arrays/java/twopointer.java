package arrays.java;

public class twopointer {
    public static void main(String[] args) {
        int arr[] = {12,45,56,67,78,89,23};
      int  n = arr.length;
        int i=0,j=n-1,temp;
        while(i<j){
            temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
