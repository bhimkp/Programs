import java.io.*;
import java.util.*;
public class BinarySearch{
    public static int binary(int[] arr, int ele){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == ele){
                return mid;
            }
            else if(arr[mid] < ele){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element U want to search");
        int element = sc.nextInt();
        System.out.println(binary(arr, element));
    }
}