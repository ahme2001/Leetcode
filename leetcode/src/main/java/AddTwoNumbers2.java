public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        int remain = 0;
        ListNode res = head;
        int value,value1,value2;
        while (l1 != null  || l2 != null){
            value1 = l1 == null?0:l1.val;
            value2 = l2 == null?0:l2.val;
            value = value1 + value2 + remain;
            head.val = value % 10;
            remain = value / 10;
            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
            if(l1 != null ||  l2 != null){
                head.next = new ListNode();
                head = head.next;
            }
        }
        if(remain > 0){
            head.next = new ListNode();
            head = head.next;
            head.val = remain;
        }
        return res;
    }
}
