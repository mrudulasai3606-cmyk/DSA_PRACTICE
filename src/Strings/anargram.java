package Strings;

import java.util.Arrays;

public class anargram {
    public static boolean isAnargram(String str,String btr){
        char ch1[] = str.toCharArray();
        char ch2[] = btr.toCharArray();
        int i = ch1.length;
        int j= ch2.length;
        if(i!=j) return false;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "listen";
        String btr = "silent";
        System.out.println(isAnargram(str,btr));
    }
}
