package Queue;
class MyQueue{
    int arr[];
    int front=-1;
    int rear=-1;
    int size;
    MyQueue(int size){
        this.size=size;
        arr=new int[size];

    }
    void push(int val){
        if(rear==size-1){
            System.out.println("Stack overflow");
            return;
        }
        System.out.println("Pushed element "+val);
        arr[++rear]=val;

    }
    int pop(){
        if(rear==-1){
            return -1;
        }
        front=arr[0];
        System.out.println("Poped element is "+front);
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    int peak(){
        if(rear==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Peak element is"+arr[0]);
        return arr[0];
    }
    boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
}
public class QueueUsingArray{
    public static void main(String[] args) {
        MyQueue q=new MyQueue(5);
        q.push(5);
        q.push(8);
        q.push(9);
        q.push(1);
        q.peak();
        q.pop();
        q.peak();


    }
}

