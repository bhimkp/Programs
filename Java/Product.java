import java.io.*;
import java.util.*;
class Product{
    static int modInverse(int a, int m)
    { 
        int m0 = m;
        int y = 0, x = 1;
        if (m == 1)
            return 0;
        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0)
            x += m0;
        return x;
    }
    static int multiplication(int[] arr){
        int ans = 1;
        for(int i = 0; i < arr.length; i++){
            ans = ans * arr[i];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] query = new int[q];
        for(int i = 0; i < q; i++){
            query[i] = sc.nextInt();
        }
        System.out.println("B"+modInverse(3,11));
        int res = multiplication(arr);
        //int M = 1000000007;
        for(int i = 0; i < q; i++){
            int temp = query[i];
            int p = (int)Math.pow(temp,n);
            int a = modInverse(res,p);
            System.out.println(a);
        }
    }
}