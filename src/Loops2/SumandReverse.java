package Loops2;

public class SumandReverse {
    public static int reverse(int n){
        int rev =0;
        while(n!=0){
           int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
        return  rev;
    }
    public static void main(String[] args) {
        int n = 1245;

//       int rev =0;
//        while(n!=0){
//            int rem = n%10;
//            rev = rev*10 + rem;
//            n = n/10;
//        }
        int b = reverse(n);
        System.out.println(b);
//        int c = n + b;
        System.out.println(n);
        System.out.println(n+b);
    }
}
