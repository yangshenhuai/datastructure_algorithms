package linkedList;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nextNode = new ListNode();
        ListNode head  = nextNode;
        while (list1 != null || list2 != null) {

            if (list1 == null){
                nextNode.next = list2;
                list2 = list2.next;
                nextNode = nextNode.next;
                continue;
            }
            if (list2 == null){
                nextNode.next = list1;
                list1 = list1.next;
                nextNode = nextNode.next;
                continue;
            }
            if ( list1.val < list2.val) {
                nextNode.next = list1;
                list1 = list1.next;
            }
            else {
                nextNode.next = list2;
                list2 = list2.next;
            }

            nextNode = nextNode.next;

        }
        return head.next;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}