package Stacks;

import java.util.Stack;

public class PostFixToPreFix {
    public static void main(String[] args) {
        String s= "953+42/*+";
        Stack<String> val = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int asci = (int) ch;
            if(asci>=48 && asci <=57){
                val.push(""+ch);
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.println(val.peek());
    }
}
