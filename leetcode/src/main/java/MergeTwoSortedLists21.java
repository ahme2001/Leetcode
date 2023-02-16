public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res;
        if((list1 != null) && (list2 != null)){
            if (list1.val < list2.val) {
                res = list1;
                list1 = list1.next;
            }else {
                res = list2;
                list2 = list2.next;
            }
        }else if(list1 != null)
            return list1;
        else
            return list2;


        ListNode head = res;
        while((list1 != null) && (list2 != null)){
            if (list1.val < list2.val){
                res.next = new ListNode(list1.val,null);
                res = res.next;
                list1 = list1.next;
            }else if (list1.val > list2.val){
                res.next = new ListNode(list2.val,null);
                res = res.next;
                list2 = list2.next;
            }else{
                res.next = new ListNode(list2.val,null);
                res = res.next;
                res.next = new ListNode(list2.val,null);
                res = res.next;
                list2 = list2.next;
                list1 = list1.next;
            }
        }

        if(list1 != null){
            res.next = list1;
        }
        if(list2 != null){
            res.next = list2;
        }
        return head;
    }
}
