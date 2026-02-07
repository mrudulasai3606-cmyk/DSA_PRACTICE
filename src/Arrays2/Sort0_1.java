package Arrays2;

import javax.crypto.spec.PSource;

public class Sort0_1 {
    static void printArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

//    public static void sort(int arr[]){
//        int i=0, j= arr.length-1;
//        if(arr[i]==0){
//            i++;
//        }
//        else if(arr[j]==1){
//            j--;
//        }
//        else if(arr[i]==1&&arr[j]==0){
//           int temp = arr[i];
//           arr[i] = arr[j];
//           arr[j] = temp;
//            i++;
//            j--;
//        }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,2,4,3,1};
        printArray(arr);
//         sort(arr);
        int i=0, j = arr.length - 1;
       while(i<j) {
            if (arr[i] %2== 1 && arr[j] %2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else if (arr[j] %2 == 1) {
                j--;
            } else if (arr[i] %2 == 0) {
                i++;
            }
        }

        System.out.println();
        printArray(arr);
    }
}

