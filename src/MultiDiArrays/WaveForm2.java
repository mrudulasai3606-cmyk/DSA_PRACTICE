package MultiDiArrays;

public class WaveForm2 {
    public static void main(String[] args) {
        int arr[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int minr=0,maxr= arr.length;
        int minc=0, maxc= arr[0].length;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                if(j%2!=0){
                    for(int k=minr;k<maxr;k++){
                        System.out.print(arr[k][j]+" ");
                    }
                }
                else{
                    for(int k=maxr-1;k>=minr;k--){
                        System.out.print(arr[k][j]+" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            break;
        }
    }
}
