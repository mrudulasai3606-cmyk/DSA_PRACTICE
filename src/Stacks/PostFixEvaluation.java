package Stacks;

import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String s = "95-342/*+";
        for(int i=0;i<s.length();i++){
            char  ch = s.charAt(i);
            int asci = (int) ch;
            if(asci>= 48 && asci <=57){
                val.push(asci-48);
            }
            else{
                int val2 = val.pop();
                int val1 = val.pop();
                if(ch=='+') val.push(val1+val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if(ch=='/') val.push(val1/val2);
            }

        }
        System.out.println(val.peek());
    }
}
