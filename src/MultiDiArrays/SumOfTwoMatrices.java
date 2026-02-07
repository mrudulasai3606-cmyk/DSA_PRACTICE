package MultiDiArrays;

public class SumOfTwoMatrices {
    public static void printArray(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,3,4},
                {5,6,7},
                {7,8,9}
        };
        int brr[][] ={
                {4,5,6},
                {6,7,8}

        };

        int sum[][] = new int[3][3];
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = brr.length;
        int c2 = brr[0].length;
        if(r1==r2 && c1==c2) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    sum[i][j] = arr[i][j] + brr[i][j];
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Wrong ");
        }
        printArray(sum);
    }
}
