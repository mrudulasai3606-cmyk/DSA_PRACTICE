package arrays.java;
import java.util.ArrayList;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(7);
        int i;
        for(i=0;i<=7;i++){
            a.add(i);
        }
        System.out.println(a);

        for(int e : a){
            System.out.println(e);
        }
    }
}
