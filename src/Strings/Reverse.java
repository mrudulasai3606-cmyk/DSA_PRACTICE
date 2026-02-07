package Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "Mru";
        int i=0;
        StringBuilder sb = new StringBuilder(str);
        int j = str.length()-1;
        while(i<j){
         char temp  = sb.charAt(i);
         sb.setCharAt(i,sb.charAt(j));
         sb.setCharAt(j,  temp);
         i++;
         j--;

        }

        System.out.println(sb.toString());
    }
}
