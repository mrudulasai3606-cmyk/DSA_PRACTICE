package Stacks;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String s = "+9*+53/42";
        Stack<Integer> val = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int asci = (int) ch;
            if(ch>=48 && ch<=57){
                val.push(asci-48);
            }
            else{
                int val1 = val.pop();
                int val2 = val.pop();
                if(ch=='+') val.push(val1+val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if(ch=='/') val.push(val1/val2);
            }
        }
        System.out.println(val.peek());
    }
}
