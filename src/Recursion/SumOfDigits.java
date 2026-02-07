package Recursion;

public class SumOfDigits {
    public static int sum(int n){
        if(n==1){
            return n;
        }
        int ans = sum(n/10) + 1 ;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sum(1234747586));
    }
}
