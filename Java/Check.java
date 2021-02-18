import java.io.*;
import java.util.*;
class Check{
    public static void main(String args[]){
       String str = "santosh kumar mallick";
       //NOTE: index starts from 0(zero) always and space will also be counted as a character.
       System.out.println(str.indexOf("santosh")); //index of 1st First occurence of 's' => 0
       System.out.println(str.indexOf('m')); // index of 1st occurence of 'm' => 10
       System.out.println(str.lastIndexOf('s')); // index of last occurence of 's' => 5
       System.out.println(str.lastIndexOf('m')); // index of last occurence of 'm' => 14
    }
}