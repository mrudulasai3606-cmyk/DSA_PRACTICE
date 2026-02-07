package Sorting;

public class BubbleSort {
    public static  void printArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
//    public static void Bubb(int arr[]){
//        int n = arr.length;
//        for(int x=0;x<n-1;x++){
//            int swap = 0;
//            for(int i=0;i<n-1-x;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp =arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    swap++;
//                }
//
//            }
//             if(swap==0) break;
//        }
 //  }

    public static void main(String[] args) {
        int arr[] ={3,6,1,9,3,90,2};
        printArray(arr);
        int n = arr.length;
        for(int x=0;x<n-1;x++){
            int swaps=0;
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }

            }
            if(swaps==0) break;
         }
        printArray(arr);
    }
}
