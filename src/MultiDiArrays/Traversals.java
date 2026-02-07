package MultiDiArrays;

public class Traversals {
    public static void printArray(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
        {4,5,6},
                {6,7,8}
        };
        int b[][] ={
                {4,5,6},
                {7,8,9},
                {7,8,1}
        };
        int n= a.length;
        printArray(a);
        printArray(b);

       int ans[][] = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               ans[i][j] = a[i][j] + b[i][j];
           }
           System.out.println();
       }
       printArray(ans);
    }
}
