package Strings;

public class equ {
    public static boolean isEqual(String str,String btr){
        int i = str.length();
        int j = btr.length();
        if(i!=j) return false;
        int a =0;
        int b=0;
        while(a!=i && b!= j){
            if(str.charAt(a) != btr.charAt(b))
                return false;
            a++;
            b++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mrudulasai";
        String btr = "Mrudulasai";
        System.out.println(isEqual(str,btr));

    }
}
