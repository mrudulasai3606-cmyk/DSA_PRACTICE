package BinarySearch;

public class SearchAtMountainPeak {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,5,3,2};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i] > arr[i-1]){
                System.out.println(arr[i]);
               // break;
            }
        }

    }
}
