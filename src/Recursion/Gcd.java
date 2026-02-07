package Recursion;

public class Gcd {
    public static int gcd(int x,int y){
        if(y==0){
           return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        System.out.println(gcd(4,6));
        int lcm = (4*6)/gcd(4,6);
        System.out.println(lcm);
    }
}
