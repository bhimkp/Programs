import java.util.*;
import java.io.*;
class MinCoin{
    static int findMinCoin(int[] arr, int S){
        int n = arr.length;
        int[] min = new int[S+1];
        min[0] = 0;
        for(int i = 1; i <= S; i++){
            min[i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i <= S; i++){
            for(int j = 0; j < n; j++){
                if(arr[j] <= i && (min[i-arr[j]]+1) < min[i]){
                    min[i] = min[i-arr[j]] + 1;
                }
            }
        }
        return min[S];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] coins = {9, 6, 5, 1};
        int v = 11;
        System.out.println(findMinCoin(coins, v));
    }
}