import java.io.*;
import java.util.*;
class LL{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Bhim");
        ll.add("Shruti");
        ll.add("Krishna");
        ll.add(2, "Dinesh");
        ll.addFirst("Sant");
        ll.addLast("Santosh");
        System.out.println(ll);
        
        ll.remove("Dinesh");
        ll.remove(3); //remove from index 3
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        ll.set(1, "Krishna"); // changing value at index 1
        System.out.println(ll);
    }
}