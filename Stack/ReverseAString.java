import java.util.Stack;
public class ReverseAString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            char ch = str.charAt(idx);
            s.push(ch);
            idx++;
        }
        String result = " ";
        while(!s.isEmpty()){
            char ch = s.pop();
            result += ch;
        }
        return result;

    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
    
}
