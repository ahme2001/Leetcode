public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        if(head != null)
            temp = new ListNode(head.val,null);
        while (head != null){
            ListNode res = head.next;
            head = res;
            if(head == null) break;
            else temp = new ListNode(head.val,temp);
        }
        return temp;
    }
}
