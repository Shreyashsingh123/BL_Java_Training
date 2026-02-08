package Stack;
import java.util.Stack;
public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer>st,int k){
        if(st.isEmpty()){
            st.push(k);
            return;
        }
            int t=st.pop();
            pushAtBottom(st,k);
            st.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        pushAtBottom(st,10);
        int a=st.peek();
        System.out.println(a);
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }

    }
}
