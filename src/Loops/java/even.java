package Loops.java;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
      int n = sc.nextInt();
      int i;
      for( i=1; i<=n;i++){
          if(i%5==0){
              System.out.println(i);
          }
      }
    }
}
