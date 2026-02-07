package Arrays2;

import java.util.Arrays;

public class SecondLarg {
    public static void main(String[] args) {
        int arr[]={34,67,12,45,56,97};
        Arrays.sort(arr);
      int n = arr.length;
        System.out.println(arr[n-2]);
    }
}
