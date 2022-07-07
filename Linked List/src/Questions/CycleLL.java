package Questions;

public class CycleLL {
    public boolean hasCycle(ListNode head){
        ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
        }
        return false;
    }
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }

        public ListNode() {

        }
    }
}
