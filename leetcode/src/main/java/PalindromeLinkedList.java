import java.util.*;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> temp  = new ArrayList<>();
        ListNode tt = head;
        while(tt != null){
            temp.add(tt.val);
            tt = tt.next;
        }
        int i=temp.size()-1;
        while(head != null){
            if(head.val != temp.get(i)) return false;
            i--;
            head = head.next;
        }
        return true;
    }
}
