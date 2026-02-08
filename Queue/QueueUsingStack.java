package Queue;
import java.util.*;
public class QueueUsingStack {
    public static void main(String[] args) {
        // MyQueue q=new MyQueue();
        add(5);
        add(2);
        add(55);
        while(!isEmpty()){
            System.out.print("Peak element is "+" ");
            System.out.println(peek());
            remove();
        }
    }
    static Stack<Integer>st1=new Stack<>();
    static Stack<Integer>st2=new Stack<>();
    public static boolean isEmpty(){
        return st1.size()==0;
    }
    public static void add(int data){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(data);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return st1.pop();
    }
public static int peek(){
if(isEmpty()){
    return -1;
}
return st1.peek();
}
}
