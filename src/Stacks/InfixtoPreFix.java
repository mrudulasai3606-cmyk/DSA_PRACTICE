package Stacks;

import java.util.Stack;

public class InfixtoPreFix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String s = "9+(5+3)*(4/2)";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int asci = (int) ch;
            if(asci>=48 && asci <=57){
              String t = "" + ch;
              val.push(t);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String t = o+val1+val2;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop();
                    String t = o+val1+val2;
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop();
                        String t = op+val1+val2;
                        val.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop();
            String t = o+val1+val2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
