package Questions;

import org.w3c.dom.Node;



public class RemoveDuplicate {
    Node head;
    int size;
    Node tail;

    public RemoveDuplicate() {
        this.size = 0;
    }

    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(1);

        list.deleteDuplicate(list.head);
        list.displayList();

    }

    public void deleteDuplicate(Node head){
        Node temp = head;

        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void displayList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
