package linkedList;

import java.util.HashMap;
import java.util.Map;



/**
 * https://leetcode.com/problems/reorder-list/
 *
 *
 * You are given the head of a singly linked-list. The list can be represented as:
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 */
public class ReorderList {


    public void reorderList_1(ListNode head) {
        Map<Integer , ListNode> nodeMap = new HashMap<>();

        ListNode node = head;
        int index = 0;
        while (node != null){
            nodeMap.put(index++,node);
            node = node.next;
        }
        for (int i=1;i<=index -1;i++){
            if (i % 2 == 0){
                head.next = nodeMap.get(i/2);
            } else {
                head.next = nodeMap.get(index -1 - (i / 2));
            }
            head = head.next;
        }
        head.next = null;

    }





    public void reorderList_2(ListNode head) {

        ListNode fast = head,slow = head;
        int i = 0;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            i++;
        }

        ListNode reverted2ndHalf = reverse(slow);

        ListNode result = merge(head,reverted2ndHalf,i);

        System.out.println(result );
        System.out.println(head);

    }

    private ListNode merge(ListNode l1, ListNode l2,int count) {
        ListNode result = l1;
        ListNode l1Next = null;
        ListNode l2Next = null;
        while (count >=0) {
            l1Next = l1.next;
            l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;
            l1=l1Next;
            l2=l2Next;
            count--;
        }

         return result;
    }


        private ListNode reverse(ListNode head){
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;
            while (cur != null){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

}
