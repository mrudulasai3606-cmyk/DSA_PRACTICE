package Arrays2;

public class targetSum {
    public static void main(String[] args) {
        int arr[]={3,4,5,7,6,7};
        int tar = 7;
        for (int i = 0; i < arr.length ; i++) {
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]== tar)
                    System.out.println(i+" "+j);
                break;
            }

        }
    }
}
