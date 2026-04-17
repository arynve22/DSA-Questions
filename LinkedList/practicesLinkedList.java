package LinkedList;
import java.util.*;


public class practicesLinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int newdata){
            this.data = newdata;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail =newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode  = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
        public void add(int index, int data){
            if(index ==0){
                addFirst(data);
                return; 
            }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
       
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    // First Approach to remove first node of the linked list
    public int removeFirst(){
        if(size == 0){
            System.out.println("llist is empty");
            return Integer.MIN_VALUE;
        }
        else if( size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;  
        return val;
    }

    //Second Approach to remove first node of the linked list
    // public void removeFirst2(){
    //     if(head == null){
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     head = head.next;  
    // }

    public int removeLast(){
        if(size == 0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if( size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
    }


    public static void main(String[] args){
        practicesLinkedList list = new practicesLinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.add(2, 3);
        list.print();
        System.out.println("Size of the linked list is: " + size);

        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();

        System.out.println("Size of the linked list is: " + size);
        
    }
}
