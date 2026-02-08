package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer>st,int k){
        if(st.isEmpty()){
            st.push(k);
            return;
        }
        int t=st.pop();
        pushAtBottom(st, k);
        st.push(t);
    }
    public static void reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int t=st.pop();
        reverse(st);
        pushAtBottom(st,t);

    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        System.out.println("Orginal stack is ");
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
        System.out.println();
        System.out.println("reversed stack is ");
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        reverse(st);
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
