public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        int remain = 0;
        ListNode res = head;
        int value;
        while (l1 != null  && l2 != null){
            value = l1.val + l2.val + remain;
            head.val = value % 10;
            remain = value / 10;
            if(l1.next != null  || l2.next != null){
                head.next = new ListNode();
                head = head.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            value = l1.val + remain;
            head.val = value % 10;
            remain = value / 10;
            if(l1.next != null){
                head.next = new ListNode();
                head = head.next;
            }
            l1 = l1.next;
        }
        while(l2 != null){
            value = l2.val + remain;
            head.val = value % 10;
            remain = value / 10;
            if(l2.next != null){
                head.next = new ListNode();
                head = head.next;
            }
            l2 = l2.next;
        }
        if(remain > 0){
            head.next = new ListNode();
            head = head.next;
            head.val = remain;
        }
        System.out.println(remain);
        return res;
    }

}
