// public static int toolchanger(List<String> tools, int startIndex, String target) {
//     // Write your code here
//     int ind_1 = 0;
//     int ind_2 = 0;
//     int ans = 0;
//     for(int i = 0; i < tools.size(); i++){
//         if(target.equals(tools.get(i))){
//             ind_1 = Math.abs(startIndex - i);
//             ind_2 = tools.size() - 1;  
//             ans = Math.min(ind_1, ind_2);
//         }
//     }
//     return ans;
//     }

public static List<String> funWithAnagrams(List<String> text) {
    // Write your code here
        Vector<String> ans = new Vector<String>();
        HashSet<String> str = new HashSet<String>();
        for(int i = 0; i < text.size(); i++){
            String word = text.get(i);
            char temp[] = word.toCharArray();      
            Arrays.sort(temp);  
            String w = String.valueOf(temp);
            if (!str.contains(w)) {
                ans.add(text.get(i)); 
                str.add(w); 
            } 
        }
        Collections.sort(ans);
        return ans;
    }





// public class Temp
// {
//     Temp() 
//     {
//         System.out.print("out");
//     }
    
//     class Inner
//     {
//         Inner() 
//         {
//             System.out.print("in");
//         }
//         public void go() 
//         {
//             System.out.print("go_in");
//         }
//     }

//     public static void main (String [] args) 
//     {
//         Temp obj = new Temp();
//         obj.fun();
//     }
//     void fun() 
//     {
//         (new Inner() {}).go();
//     }
// }
// class MyThread extends Thread 
// {
//     MyThread() 
//     {
//         System.out.print(" Thread");
//     }
//     public void run() 
//     {
//         System.out.print(" 2");
//     }
//     public void run(String s) 
//     {
//         System.out.println(" 3");
//     }
// }
// public class Temp 
// {
//     public static void main (String [] args) 
//     {
//         Thread t = new MyThread() 
//         {
//             public void run() 
//             {
//                 System.out.println(" 1");
//             }
//         };
//         t.start();
//     }
// }
// class Temp 
// {
//     public static void main(String args[]) 
//     {
//         double a = 354.03;
//         int  b = 256;
//         byte c = (byte) a;
//         byte d = (byte) b;
//         System.out.println(c + "\t"  + d);
//     } 
// }

// class Temp 
//     {
//         final public int calc(int a, int b) { return 1; } 
//     } 
//     class Child extends Temp 
//     { 
//         public int calc(int a, int b) { return false; } 
//     } 
//      public class Writeout 
//      {
//         public static void main(String args[]) 
//         { 
//             Child c = new Child(); 
//             System.out.print("c is:" + c.calc(0,1));  
//         } 
//     }

// import java.util.*; 
// class Temp
// {
// 	public static void main(String arg[])
// 	{
//         List<String>  list = new ArrayList<String>(); 
//         list.add("DoSelect"); 
//         list.add("InMobi"); 
//         list.add("CampusHash"); 
//         list.add("mKhoj");
//         list.add("Microsoft");
   
//         System.out.println("Original: " + list); 
   
//         Collections.rotate(list, -2); 
   
//         System.out.println("Rotated: " + list);
// 	}
// }

import java.util.*;
import java.io.*;
class Temp{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int p = 1;
                int q = 1;
                int x = 1;
                int y = 1;
                int 
        }
}