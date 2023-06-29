public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode resodd = odd;
        ListNode reseven = even;
        while(even.next != null){
            odd.next = even.next;
            odd = odd.next;
            if(odd.next != null){
                even.next = odd.next;
                even = even.next;
            }else{
                even.next = null;
                break;
            }
        }
        odd.next = reseven;
        return resodd;
    }
}
