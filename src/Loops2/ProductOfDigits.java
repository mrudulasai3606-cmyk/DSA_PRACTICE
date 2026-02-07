package Loops2;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 12348;
        int pro = 0;
        while(n>0){
            int rem = n%10;
            if(rem%2==0){
             pro = pro +rem;
            }
            n = n/10;
        }
        System.out.println(pro);
    }
}
