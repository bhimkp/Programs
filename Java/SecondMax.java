import java.io.*;
import java.util.*;
class SecondMax{
    static int secondLargest(int[] arr, int n){
        int first = 0;
        int second = 0;
        for(int i = 0; i < n; i++){
            first = Math.max(first, arr[i]);
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != first){
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr, n));
    }
}