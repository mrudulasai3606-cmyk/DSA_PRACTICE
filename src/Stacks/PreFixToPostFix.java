package Stacks;

import java.util.Stack;

public class PreFixToPostFix {
    public static void main(String[] args) {
        String str = "+9*+53/42";
        Stack<String> val = new Stack<>();
        for(int i= str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int asci = (int) ch;
            if(asci>=48 && asci <=57 ){
                String t = ""+ch;
                val.push(t);
            }
            else{
                String val1 = val.pop();
                String val2 = val.pop();
                String t = val1+val2+ch;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
