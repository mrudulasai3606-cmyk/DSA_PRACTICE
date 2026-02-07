package Recursion;

public class ppowq {
    public static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        int ans = pow(p,q/2) * pow(p,q/2);
        if(q%2==0) return  ans;
        else  return  p * ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,7));
    }
}
