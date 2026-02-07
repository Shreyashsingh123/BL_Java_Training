package Stack;
import java.util.*;
class Stack{
    int size;
    int arr[];
    int top=-1;
    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        else{
            arr[++top]=data;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Underflow Stack");
            return -1;
        }
        else{
            // System.out.println(arr[--top]);
            return arr[top--];
        }
    }
boolean isEmpty(){
    if(top==-1)return true;
    return false;
}
int peak(){
    if(top==-1){
        System.out.println("Empty stack");
        return -1;
    }
    else{
        // System.out.println(arr[top]);
        return arr[top];
    }
}
}
public class StackUsingArrays{
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(1);
        st.push(5);
        st.push(8);
        System.out.println("Top element is "+ st.peak());
        System.out.println("Poped element is "+st.pop());
        System.out.println("Poped element is "+st.pop());
    }
}
