import java.io.*;
import java.util.*;
class Diagonal{
    static int primaryDiagonal(int[][] arr, int n){
        System.out.print("Primary Diagonal: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                if(i == j)
                    System.out.println(arr[i][j]);
            }
        }
        return 0;
    }
    static int secondaryDiagonal(int arr[][], int n){
        System.out.print("Secondary Diagonal: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                if((i + j == n - 1))
                    System.out.println(arr[i][j]);
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        primaryDiagonal(arr,n);
        secondaryDiagonal(arr,n);
    }
}