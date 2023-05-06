public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode res = head;
        int remain = 0;
        while (l1 != null  && l2 != null){
            int val = l1.val + l2.val + remain;
            if(val > 9 ) {
                remain = val % 9;
                head.val = 9;
            }else {
                remain = 0;
                head.val = val;
            }
            head.next = new ListNode();
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        int val;
        while (l1 != null){
            val = l1.val + remain;
            if(val > 9 ) {
                remain = val % 9;
                head = new ListNode(9,new ListNode());
            }else {
                remain = 0;
                head = new ListNode(val,new ListNode());

            }
            head = head.next;
            l1 = l1.next;
        }
        while (l2 != null){
            val = l2.val + remain;
            if(val > 9 ) {
                remain = val % 9;
                head = new ListNode(9,new ListNode());
            }else {
                remain = 0;
                head = new ListNode(val,new ListNode());

            }
            l2 = l2.next;
            head = head.next;
        }
        return res;
    }

}
