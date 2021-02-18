import java.io.*;
import java.util.*;
public class UniqueChars{
    static final int SIZE = 256;
    public static String printUniqueChars(String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();
        String ans = "";
        for(char c: arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }
        Integer a = 1;
        for(Map.Entry entry : map.entrySet()){
            if(entry.getValue() == a){
                ans += entry.getKey();
            }
        }
        return ans.trim();
    }

    public static String findUniqueChars(String str){
        int count[] = new int[SIZE];
        int i;
        String ans = "";
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                count[(int)str.charAt(i)]++;
            }
        }
        //int n = i;
        for(i = 0; i < str.length(); i++){
            if(count[(int)str.charAt(i)] == 1){
                ans += str.charAt(i);
                //break; (Use this for first non-repeating caharacter)
            }
        }
        return ans;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findUniqueChars(s));
        System.out.println(printUniqueChars(s));
    }
}