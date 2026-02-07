package Strings;

import java.util.HashSet;

public class dup {
    public static boolean containsDuplicate(String str){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i)))
                return true;
            set.add(str.charAt(i));
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Mrudla";
        System.out.println(containsDuplicate(str));
    }
}
