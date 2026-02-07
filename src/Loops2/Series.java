package Loops2;

public class Series {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(i*-1);
            }
            else {
                System.out.println(i);
            }
        }
    }
}
