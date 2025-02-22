import java.util.Stack;

public class ValidParenthesis2 {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' || 
               ch=='['|| ch=='<')
               {
                    s.push(ch);
               }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') 
                || (s.peek()=='[' && ch==']')
                || (s.peek()=='{' && ch=='}')
                || (s.peek()=='<' && ch=='>')){
                    s.pop();
            }
            }
        }
    }
    public static void main(String[] args) {
        String str = "({})<[]>";
        
    }
}
