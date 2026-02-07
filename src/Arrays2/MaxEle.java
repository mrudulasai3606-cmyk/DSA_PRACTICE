package Arrays2;

public class MaxEle {
    public static void main(String[] args) {
        int arr[] = {34,56,67,78,89000};
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
            }
}
