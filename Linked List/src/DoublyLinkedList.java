import org.w3c.dom.Node;

public class DoublyLinkedList {
    private Node head;

//    insert at head
    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        node.prev = null;
        head = node;
    }

//    insert at tail
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

//    insert after a position
    public void insert(int after, int value){
        Node p = find(after);
        if(p == null){
            System.out.println("This does not exist.");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }

    }

//    find index of a value
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

//    printing the list
    public void displayList(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("\nPrint in reverse: ");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
