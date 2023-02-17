import java.util.HashSet;

public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        HashSet<ListNode> temp = new HashSet<>();
        ListNode res = head;
        temp.add(head);
        head = head.next;
        while(head != null){
            if(temp.contains(head))
                return head;
            temp.add(head);
            res = head;
            head = head.next;
        }
        return null;
    }
}
