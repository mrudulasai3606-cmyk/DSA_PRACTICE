package Arrays2;

public class SortedArrayDesc {
    static  void printArray(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void reverse(int arr[]){
        int i=0,j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void SortArray(int arr[]){
        int i=0,j= arr.length-1;
        int k=0;
        int ans[] = new int[arr.length];
       while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k] = arr[i] * arr[i];
                k++;
                i++;
            }
            else {
                ans[k] = arr[j]*arr[j];
                k++;
                j--;
           }
        }
       reverse(ans);
       printArray(ans);
    }
    public static void main(String[] args) {
        int arr[] = {-10,-2,1,4,5};
        printArray(arr);
        System.out.println();
        SortArray(arr);
    }
}
