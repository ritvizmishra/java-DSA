package Questions;

import java.util.List;

public class ReverseList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode present = head;
        ListNode prev = null;

        for(int i = 0; present != null && i < left - 1; i++){
            prev = present;
            present = present.next;
        }
        ListNode last = prev;
        ListNode end = present;
        ListNode next = present.next;

        for(int i = 0; present != null && i < right - left + 1; i++){
            present.next = prev;

            prev = present;
            present = next;
            if(next.next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        end.next = present;

        return head;
    }

//    25
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        int length = lengthList(head);

        int i = 0;
        while(i <= length){
            for(int j = 0; j < k; j++){
                reverseList(temp);
            }
            temp = temp.next;
            i += k;
        }
        temp = temp.next;
        return head;
    }

    public int lengthList(ListNode head) {
        ListNode temp = head;

        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = previous;

            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return previous; // previous == head, present == null
    }

}
