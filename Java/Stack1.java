import java.io.*;
import java.util.*;
class Stack1{
    //Pushing element to the Top of the Stack
    static void st_push(Stack<Integer> st){
        for(int i = 0; i < 5; i++){
            st.push(i);
        }
    }
    // Popping element from the Top of the stack
    static int st_pop(Stack<Integer> st){
        int x = st.pop();
        return x;
    }
    // Displaying element on the top of the stack
    static int st_peek(Stack<Integer> st){
        return st.peek();
    }
    //Searching element in the stack
    static int st_search(Stack<Integer> st, int element){
        int pos = st.search(element);
        return pos;
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<Integer>();
        st_push(st);
        System.out.println(st);
        System.out.println(st_peek(st));
        st_pop(st);
        System.out.println(st);
        int pos = st_search(st, 1);
        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("ELement found at position: "+pos);
        }
    }
}