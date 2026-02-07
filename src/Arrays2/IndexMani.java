package Arrays2;

public class IndexMani {
    public static void main(String[] args) {
        int arr[] = {4,67,7,8,23,97};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print((arr[i]+10)+" ");
            }

            else{
                System.out.print(arr[i]*2+" ");
            }
            System.out.println();
        }
    }
}
