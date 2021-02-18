import java.io.*;
import java.util.*;
class Stack2{
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];
    
    boolean isEmpty(){
        return (top < 0);
    }
    Stack2(){
        top = -1;
    }
    boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top < 0){
            System.out.println("Stack is underflow");
        }
        else{
            int x = arr[top--];
            return x;
        }
        return 0;
    }
    public static void main(String args[]){
        Stack2 st = new Stack2();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(90);
        System.out.println(st.pop());
        st.push(100);
    }
}