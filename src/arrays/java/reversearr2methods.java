package arrays.java;

public class reversearr2methods {
    public static void main(String[] args) {
        int arr[] = {23, 5, 6, 1, 87, 97, 567, 129};
        int n = arr.length;
        int i=0, j=n-1-i;
//        for (i = 0; i < n; i++) {
//            j = n - 1 - i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            j--;
//        }
//        while(i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}

