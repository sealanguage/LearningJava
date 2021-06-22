import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
    //   input: head   output: head
    
    //if head is null, return head\
      //preserve the head.
      //Node trav1 = head;
      //Node trav2 = head.next;
      //while trav2 is not equal to null;
        //compare trav1 and trav2
            //if they are different, 1) make trav1 equal to trav2 (trav1 = trav2) and 2) move trav2 to next node (trav2 = trav2.next), 3) trav1.next = trav2?
            //if they are the same, move trav2 to next node.trav2 = trav2.next
            
        if (head == null) {
            return head;
        }
        Node trav1 = head;
        Node trav2 = head.next;
        
        while(trav2 != null) {
            if (trav1.data != trav2.data) {
                trav1.next = trav2;
                trav1 = trav2;
                trav2 = trav2.next;
                // trav1 = trav2;
                continue;
            }
            else {
                trav2 = trav2.next;
                
            }
            trav1.next = null;
        }   
    return head;

    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }