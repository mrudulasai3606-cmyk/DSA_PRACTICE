package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "aaa";
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("false");
                break;}
            else System.out.println("true");
            i++;
            j--;
        }


    }
}
