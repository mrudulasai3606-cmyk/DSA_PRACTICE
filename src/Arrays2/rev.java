package Arrays2;

public class rev {
    public static void main(String[] args) {
        int arr[] = {12,34,45,56,67,78};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        int n = arr.length;
        int j=n-1;
        for(int i=0;i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
