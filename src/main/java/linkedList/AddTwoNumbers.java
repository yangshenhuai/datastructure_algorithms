package linkedList;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode preNode = null;
        ListNode sum ;
        int previousVal = 0;
        while(l1 != null || l2 != null){
            int l1Val = l1 != null? l1.val : 0;
            int l2Val = l2 != null? l2.val : 0;
            sum = new ListNode((l1Val + l2Val + previousVal) % 10 );
            if (preNode != null){
                preNode.next = sum;
            } else {
                result = sum;
            }
            previousVal = (l2Val + l1Val + previousVal) / 10;
            preNode = sum;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (previousVal > 0){
            preNode.next = new ListNode(previousVal);
        }
        return result;
    }
}
