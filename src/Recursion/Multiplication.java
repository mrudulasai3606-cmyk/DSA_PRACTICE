package Recursion;

public class Multiplication {
    public static int multi(int a,int b){
        if(b==0){
            return a;
        }
        return   multi(a,b-1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(multi(567,5));
    }
}
