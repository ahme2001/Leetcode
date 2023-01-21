class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head != null){
            ListNode Head = head;
            ListNode node = head.next;
            while (node != null){
                if(Head.val == node.val){
                    Head.next = node.next;
                    node = node.next;
                    continue;
                }
                Head = node;
                node = node.next;
            }
        }
        return head;
    }
}
