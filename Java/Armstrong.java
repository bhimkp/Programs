import java.util.*;
class Armstrong{
    static int isArmstrong(int n){
        int temp;
        temp = n;
        int sum = 0;
        int ans = 0;
        int rev = 0;
        while(temp != 0){
            int last_digit = temp % 10;
           // rev = rev * 10 + last_digit;
            sum = sum + last_digit * last_digit * last_digit;
            temp = temp / 10;
        }
        //System.out.println(rev);
        if(n == sum){
            ans = 1;
        }
        else{
            ans = 0;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = isArmstrong(n);
        if(res == 1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}