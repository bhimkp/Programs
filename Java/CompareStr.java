import java.io.*;
import java.util.*;
class CompareStr{
    static boolean isEqual(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int l = Math.min(s1.length(), s2.length());
        for(int i = 0; i < l; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(isEqual(str1, str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}