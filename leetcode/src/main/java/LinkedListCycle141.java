import java.util.HashSet;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        HashSet<ListNode> temp = new HashSet<>();
        ListNode res = head;
        temp.add(head);
        head = head.next;
        while(head != null){
            if(temp.contains(head))
                return true;
            temp.add(head);
            res = head;
            head = head.next;
        }
        return false;
    }
}
