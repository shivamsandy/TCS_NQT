import java.util.Stack;

public class _0028 {
    public static void main(String[] args) {
        String s = "()[}";
        Stack<Character> st =  new Stack<>();


        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    System.out.println("false");
                    break;
                }
                char top  = st.pop();
                if(ch==')' &&top!='('){
                    System.out.println("false");
                    break;  
                }
                  if(ch==']' &&top!='['){
                    System.out.println("false");
                    break;
                }
                  if(ch=='}' &&top!='{'){
                    System.out.println("false");
                    break;
                }
            }

        }
 




    }
    
}
