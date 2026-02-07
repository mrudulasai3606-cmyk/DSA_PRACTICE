package BinarySearch;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,4,4,4,4,5,5};
        int n = arr.length;
        int lo =0;
        int hi = n-1;
        int tar = 4;
        int idx = -1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<tar) lo = mid +1;
            else if(arr[mid]>tar) hi = mid -1;
            else{
                idx = mid;
                lo = mid +1;
                System.out.println(idx);
            }
        }
        System.out.println(idx);
    }
}
