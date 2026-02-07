package Arrays2;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {3,3,4,5,6};
        int ans[] = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                else{
                    ans[i] = arr[i] ;
                }
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
