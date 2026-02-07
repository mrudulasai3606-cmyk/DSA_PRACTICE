package MultiDiArrays;

public class SpiralArray {
    public static void pritnArray(int arr[][]){
        for(int ele[] : arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Spiral(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int minr=0 , maxr = n-1;
        int minc = 0, maxc = m-1;
        while(minr<=maxr && minc<= maxc){
            for(int j=minc ; j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            if(minr>=maxr || minc>=maxc) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>=maxr || minc>=maxc) break;
            for(int j = maxc; j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            if(minr>=maxr || minc>=maxc) break;//minc
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        pritnArray(arr);
        Spiral(arr);
        System.out.println();
        pritnArray(arr);
    }
}
