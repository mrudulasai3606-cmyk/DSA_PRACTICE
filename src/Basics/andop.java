package Basics;
import java.util.Scanner;
public class andop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0)
            System.out.println("1st Quad");
        else if(x<0 && y>0)
            System.out.println("2nd Quad");
        else if(x>0 && y<0)
            System.out.println("3rd Quad");
        else
            System.out.println("4th quad");
            }
}
