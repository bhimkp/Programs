import java.io.*;
import java.util.*;
class Prime{
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
       if(ans){
           System.out.println("Prime");
       }
       else{
           System.out.println("Not Prime");
       }
    }
}