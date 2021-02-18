import java.util.*;
import java.io.*;
class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] switches = new int[n];
        for(int i = 0; i < n; i++){
            switches[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] query = new int[q];
        for(int i = 0; i < q; i++){
            query[i] = sc.nextInt();
        }
        int len = n / 2;
        int i = 0;
        int c = 0;
        while(i < q){
            int[] ps = new int[n];
            int[] cs = switches;
            int t = query[i];
            int j = 0;
            int ts = 0;
            while(t > 0){
                ps[j] = t % 2;
                t = t / 2;
                j++;
            }
             for(int z = cs.length-1; z >= 0; z--){
                 if(cs[z] != ps[z]){
                     ts++;
                 }
            }
            if(n % 2 == 0){
                if(ts >= len){
                    c++;
                }
            }
            else{
                if(ts > len){
                    c++;
                }
            }
            switches = ps;
            i++;
        }
        System.out.println(c);
    }
}