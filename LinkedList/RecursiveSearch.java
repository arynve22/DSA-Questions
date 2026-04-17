package LinkedList;

public class RecursiveSearch {
    

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


    public int helper(Node head, int key){
        
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }
    
    

    public static void main(String[] args){
        RecursiveSearch ll = new RecursiveSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        
       System.out.println(ll.recursiveSearch(3)); // Output: 2 (index of the key in the linked list)
       System.out.println(ll.recursiveSearch(6)); // Output: -1 (key not found)
    
    }
}


  
