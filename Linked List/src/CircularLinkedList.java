import org.w3c.dom.Node;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

//    inserting at end
    public void insertLast(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

//    deleting something
    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);

    }

//    printing the list
    public void displayList(){
        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node{
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
