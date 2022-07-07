package Questions;

public class CycleNode {
    public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            int length = 0;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    length = cycleLength(slow);
                   break;
                }
            }
            if(length == 0){
                return null;
            }

            ListNode pointF = head;
            ListNode pointS = head;

            while(length > 0){
                pointS = pointS.next;
                length--;
            }
            while(pointF != pointS){
                pointS = pointS.next;
                pointF = pointF.next;
            }
            return pointF;
    }

    public int cycleLength (ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
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
