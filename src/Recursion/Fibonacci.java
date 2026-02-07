package Recursion;

public class Fibonacci {
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans = Fib(n-1) + Fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        for(int i=0;i<=7;i++) {
            System.out.print(Fib(i)+" ");
        }
    }
}
