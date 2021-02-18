import java.io.*;
import java.util.*;
class BalancedParenthesis{
    static boolean isBalanced(String exp){
        if(exp.length() % 2 == 1){
            return false;
        }
        else{
            Stack<Character> s = new Stack<>();
            for(char bracket: exp.toCharArray()){
                switch(bracket){
                    case '{':
                        s.push('}');
                        break;
                    case '(':
                        s.push(')');
                        break;
                    case '[':
                        s.push(']');
                        break;
                    default:
                        if(s.isEmpty() || bracket != s.peek()){
                            return false;
                        }
                        s.pop();
                }
            }
            return s.isEmpty();
        }
    }
    public static void main(String args[]){
        String s = "[(])";
        boolean ans = isBalanced(s);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}