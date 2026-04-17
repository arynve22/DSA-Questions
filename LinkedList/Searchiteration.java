package LinkedList;

public class Searchiteration {
    

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


    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data ==key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    

    public static void main(String[] args){
        Searchiteration ll = new Searchiteration();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        
        System.out.println(ll.search(3));
         System.out.println(ll.search(6));
    
    }

    public char[] recursiveSearch(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recursiveSearch'");
    }
}


  