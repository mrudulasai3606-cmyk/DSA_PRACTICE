package Arrays2;

public class RotateAnArray {
    public static void reverse(int arr[],int i, int j){
       while(i<=j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int k =5;
        print(arr);
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.println();
        print(arr);

    }
}
