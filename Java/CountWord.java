import java.io.*;
import java.util.*;
class CountWord{
    static int countWord(String str, String word){
        String arr[] = str.split(" ");
        int count = 0;
        int n = arr.length;
        for(int i = 0; i <n;  i++){
            if(word.equals(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(countWord(str,word));
    }
}