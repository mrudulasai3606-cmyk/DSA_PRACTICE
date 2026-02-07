package MultiDiArrays;

public class ProductOfMatrices {
    public static void printArray(int arr[][]){
        for (int ele[] : arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
        };
        int brr[][] ={
                {3,4},
                {6,8},
                {1,2}
        };
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = brr.length;
        int c2 = brr[0].length;
        int pro[][] = new int[r1][c2];
        if(c1==r2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        pro[i][j] += arr[i][k] * brr[k][j];
                    }
                }
                System.out.println();
            }

        }

        else{
            System.out.println("Couldnt print!Wrong");
        }
        printArray(pro);
    }
}
