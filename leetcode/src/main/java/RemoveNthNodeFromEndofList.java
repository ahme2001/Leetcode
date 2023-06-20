public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode test = head;
        int count=0;
        while(head != null){
            count++;
            head = head.next;
        }
        if(count == 1)  return null;
        if(count == n)
            return test.next;

        ListNode test2 = test;
        for(int i=0;i<(count-n)-1;i++){
            test = test.next;
        }
        if(n == 1)
            test.next = null;
        else
            test.next = test.next.next;
        return test2;
    }
}
