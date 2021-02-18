import java.io.*;
import java.util.*;
public class Reverse{
    public static String reverse(String str){
        //char ch[] = str.toCharArray();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static String reverseStr(String str){
        int i = 0;
        int j = str.length() - 1;
        char[] ch = str.toCharArray();
        while(i <= j){
            char temp = str.charAt(i);
            ch[i] = str.charAt(j);
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseStr(s));
        String res = reverse(s);
        String ans = "";
        for(int i = 0; i < res.length(); i++){
            char ch = res.charAt(i);
            if(i % 2 == 0)
                ans += Character.toLowerCase(ch);
                //ans += ch;
            else
            {
                ans += Character.toUpperCase(ch);
            } 
        }
        System.out.println(ans);
    }
}