package MultiDiArrays;

public class Transpose {
    public static void printArray(int arr[][]){
        for (int ele[] : arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans[][] = new int[3][3];
        int n= arr.length;
        int m= arr[0].length;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
               ans[i][j] = arr[j][i];
            }
            System.out.println();
        }
        printArray(ans);
    }
}
