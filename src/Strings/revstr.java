package Strings;

import java.util.Stack;

public class revstr {
    public static void main(String[] args) {
        String str = "mrudula";
        Stack<String> st = new Stack();
        st.push(str);
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        String res = sb.toString();
        System.out.println(res);

    }
}
