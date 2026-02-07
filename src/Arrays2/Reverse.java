package Arrays2;

public class Reverse {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,45,56,67,78,98};
        int i=0,j= arr.length-1;
        print(arr);
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        print(arr);
    }
}
