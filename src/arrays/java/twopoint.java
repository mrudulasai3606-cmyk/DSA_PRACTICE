package arrays.java;

public class twopoint {
    public static void main(String[] args) {
        int[] arr = {23,56,34,12,35,78,119};
        int n= arr.length;

        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        System.out.println();
        int m=0, j=n-1;
        while(m<=j){
            int temp = arr[m];
            arr[m] = arr[j];
            arr[j] = temp;
            m++;
            j--;
        }
        for(int ele : arr){
            System.out.println(ele);
        }

    }
}
