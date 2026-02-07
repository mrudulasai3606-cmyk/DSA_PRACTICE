package Recursion;

public class SumSeries {
    public static int Sum(int n){
        if(n==1){
            return -1;
        }
        if(n%2==0){
            return Sum(n-1) + n;
        }
        else{
            return Sum(n-1) - n;
        }
    }
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
