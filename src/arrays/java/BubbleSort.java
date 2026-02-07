package arrays.java;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5,};
        print(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr[i], arr[i + 1]);
            }
        }
        print(arr);
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }


    public static void print(int arr[]){
        for(int ele: arr){
            System.out.println(ele);

        }
    }
}
