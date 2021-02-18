import java.io.*;
import java.util.*;
class Series{
    public static int findNthTerm(int n){
        int ans = 0;
        if(n % 2 == 0){
            //ans.add(2*n*n+1);
            ans = 2 * n * n + 1;
        }
        else{
            //ans.add(2*n*n-1);
            ans = 2 * n * n - 1;
        }
        return ans;
    }
    public static ArrayList<Integer> printSeries(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                ans.add(2*i*i+1);
            }
            else{
                ans.add(2*i*i-1);
            }
        }
        return ans;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<Integer>();
        res = printSeries(n);
        for(int i = 0; i < n; i++){
            System.out.println(res.get(i));
        }
        System.out.println(n+"th term:"+findNthTerm(n));
    }
}