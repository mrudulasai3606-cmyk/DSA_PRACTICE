package Strings;

public class V_C {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch =='e'|| ch =='i' || ch=='o' || ch=='u') return true;
        else if(ch=='A' || ch =='E'|| ch =='I' || ch=='O' || ch=='U') return true;
        else return false;
    }
    public static void main(String[] args) {
        String str = "sai";
        int c =0;
        int v=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("V "+v+ " C "+c);
    }
}
