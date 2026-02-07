package Loops.java;
import java.util.Scanner;
public class multilpicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.println(i*a);
        }
        //2nd method
        System.out.println("Print tables");
        int c = sc.nextInt();
        for(i=c;i<=c*10;i=i+c)
            System.out.println(i);
    }
}
