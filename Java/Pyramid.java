import java.io.*;
import java.util.*;
class Pyramid{
    public static void main(String args[]){
        int n = 10;
        int temp = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < temp; j++){
                System.out.print(" ");
            }
            temp--;
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}