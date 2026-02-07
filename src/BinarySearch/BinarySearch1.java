package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int arr[] = {23,45,56,67,89};
        int lo = 0;
        int tar = 67;
        int hi= arr.length-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==tar) {
                flag = true;
                break;
            }
                        else if(arr[mid]<tar) lo = mid+1;
            else hi = mid -1;
        }
        if(flag== true)
        {System.out.println("Found Youuu!!");}
        else {System.out.println("Not Foubd!!");}
    }
}
