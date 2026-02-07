package Basics;
import java.util.Scanner;
public class profitloss
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP:");
        int a = sc.nextInt();
        System.out.println("Enter SP");
        int b = sc.nextInt();
        if(b>a){
            System.out.println("Profit");
        }
        else {
            System.out.println("loss");
        }
        if(a==b){
            System.out.println("NPLP");
        }
    }
}
