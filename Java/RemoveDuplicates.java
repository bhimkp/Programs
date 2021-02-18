import java.io.*;
import java.util.*;
class RemoveDuplicates{
    static void removeDup(int arr[]){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == null){
                System.out.print(arr[i]+" ");
            }
            map.put(arr[i], true);
        }
    }

   
    public static void main(String args[]){
        int[] arr = {1,2,3,4,99,10,1,23,32,1,2,3,4};
        removeDup(arr);
    }
}