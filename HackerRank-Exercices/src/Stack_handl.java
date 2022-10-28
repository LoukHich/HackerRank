import java.util.Scanner;
import java.util.Stack;

public class Stack_handl {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st= new Stack<>();
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            st.clear();
            boolean pass = true;
            for (Character c : input.toCharArray()) {
                if(c=='(') st.push(')');
                else if(c=='[') st.push(']');
                else if(c=='{') st.push('}');
                else if(st.isEmpty()) pass = false;
                else if(st.pop()!=c) pass = false;
            }

            if (!st.isEmpty()) pass = false;
            System.out.println(pass);
        }

    }
}
