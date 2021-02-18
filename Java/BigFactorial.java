import java.io.*;
import java.util.*;
import java.math.BigInteger;
class BigFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fac = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }
}