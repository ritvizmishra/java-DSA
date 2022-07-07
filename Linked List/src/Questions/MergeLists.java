package Questions;

public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode ans, tempHead;
        if(list1.val < list2.val){
            tempHead = ans = new ListNode(list1.val);
            list1 = list1.next;
        }else{
            tempHead = ans = new ListNode(list2.val);
            list2 = list2.next;
        }

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tempHead.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                tempHead.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tempHead = tempHead.next;
        }

        while(list1 != null){
            tempHead.next = new ListNode(list1.val);
            list1 = list1.next;
            tempHead = tempHead.next;
        }

        while(list2 != null){
            tempHead.next = new ListNode(list2.val);
            list2 = list2.next;
            tempHead = tempHead.next;
        }

        return ans;
    }

    public class ListNode{
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
