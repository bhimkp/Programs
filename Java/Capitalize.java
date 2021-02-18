import java.io.*;
import java.util.*;
class Capitalize{
    public static String capitalFirst(String str){
        String[] words = str.split(" ");
        String ans = "";
        for(String s: words){
            ans += Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ";
        }
        return ans.trim();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(capitalFirst(str));
    }
}