package LinkedList;

import java.util.*;

public class BaiseLinkedlist {

    //Node class to represent each element in the linked list mtlb ki har node me data aur next ka reference/address hoga
    public static class Node{
        int data;
        Node next;

        public Node(int newdata){
            this.data = newdata;
            this.next = null;
        }
    }
    public static Node head; // head node is the starting point of the linked list, it will point to the first node in the list
    public static Node tail; // Tail node is the last node in the linked list, it will point to the last node int the list 


    //Method to add a new node at the beginning(Start) of the linked list
    public void addFirst(int data){

        //step 1 create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 link new node to head
        newNode.next = head;

        //step 3 update head to new node
        head = newNode;

    }

    //Method to add a new node at the end(Last of the node) of the linked list 
    public void addLast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
        //Print the linked list 
    public void print(){
        
          if(head == null){
            System.out.println( "Linked list is empty");
            return;
          }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args){
        BaiseLinkedlist ll = new BaiseLinkedlist();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
      

    
    }
}
