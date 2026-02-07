package Stack;
import java.util.*;
class MyStack{
    ArrayList<Integer>ls;
    MyStack(){
        ls=new ArrayList<>();
    }
    void push(int val){
        System.out.println(val+" pushed into stack");
        ls.add(val);
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return ls.remove(ls.size()-1);
        }
    }
   
    int peak(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return ls.get(ls.size()-1);
        }
    }
    boolean isEmpty(){
        return ls.size()==0;
    }
    int size(){
        return ls.size();
    }
}
public class StackUsingArrayList{
    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(5);
        st.push(2);
        st.push(3);
        System.out.println("Size of stack is  "+st.size());
        System.out.println("poped elemnt is  "+st.pop());
        System.out.println("peak elemnt is "+st.peak());
        System.out.println("Size of stack is  "+st.size());

}
}
