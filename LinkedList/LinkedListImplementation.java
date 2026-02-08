package LinkedList;
import java.util.*;
public class LinkedListImplementation {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
       public void addfirst(String data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
       public void addLast(String data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
       public void print(){
            if(head==null){
                System.out.println("Empty list");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    public void deletefirst(){
        Node temp=head;
        if(temp==null){
            System.out.println("EMpty list");
            return ;
        }
        temp=temp.next;
        head=temp;
        return;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newnode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    public static void main(String[] args) {
        LinkedListImplementation ll=new LinkedListImplementation();
        ll.addfirst("5");
        ll.addfirst("6");
        ll.print();
        ll.addLast("7");
        ll.addLast("8");
        ll.print();
        ll.addfirst("1");
        ll.addfirst("2");
        ll.addfirst("3");
        ll.addLast("6");
        ll.addLast("0");
        ll.print();
        ll.deletefirst();
        ll.print();
        ll.deleteLast();
        ll.print();
      ll.head= ll.reverseRecursive(ll.head);
       ll.print();


    }
}
