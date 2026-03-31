/* Example to create 3 Node
    linked-list
 */
import java.util.*;
public class linkedList_eg {

    Node head; // head of linked list

    static class Node {
        int data;
        Node next;

        //constructor to create a new node
        Node(int d){
            data = d;
            next =null;
    }

    }
    public void printList(){
        Node current = head;
        int count = 1;

        while (current!=null){
            System.out.println(current.data+" " + count);
            current = current.next;
            count++;
        }


    }

    public static void main(String[] args){

        linkedList_eg mylist = new linkedList_eg();
        mylist.head = new Node(16);
        Node second = new Node(19);
        Node THIRD = new Node(22);

        mylist.head.next = second;
        second.next = THIRD;

        mylist.printList();


    }
}
