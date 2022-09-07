package linkedList;


/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * 19. Remove Nth Node From End of List
 *
 *
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */
public class RemoveNthNodeFromEndOfList {



    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = head;

        int count = 0;
        while (h != null){
            h = h.next;
            count++;
        }

        int k = count - n ;
        // if n =2
        //count = 5
        // then find count - n = 3 and 3's next should be 4's next.next;
        if (k == 0) {
            return head.next;
        }
        ListNode node = head;
        while(k > 1){
            node = node.next;
            k--;
        }
        node.next = node.next.next;

        return head;
    }




}
