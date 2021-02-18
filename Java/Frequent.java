import java.io.*;
import java.util.*;
import java.util.Map.*;
class Frequent{
    static int mostFrequent(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            int ele = arr[i];
            if(mp.containsKey(ele)){
                mp.put(ele, mp.get(ele) + 1);
            }
            else{
                mp.put(ele, 1);
            }
        }
        int count = 0;
        int res = 0;
        for(Entry<Integer, Integer> e: mp.entrySet()){
            if(count < e.getValue()){
                res = e.getKey();
                count = e.getValue();
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {1,5,2,1,3,9,5,7,5,5};
        System.out.println(mostFrequent(arr));
    }
}