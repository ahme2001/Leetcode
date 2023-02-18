public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head = head.next;
        }
        ListNode res = head;
        ListNode pre = head;
        while(head != null){
            if(head.val == val){
                pre.next = head.next;
            }else
                pre = head;
            head = head.next;
        }
        return res;
    }
}
