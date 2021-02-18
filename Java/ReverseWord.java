import java.io.*;
import java.util.*;
public class ReverseWord{
    public static String revWords(String str){
        String arr[] = str.split(" ");
        String ans = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(!arr[i].isEmpty()){
                ans += arr[i] + " ";
            }
        }
        return ans;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(revWords(s));
    }
}