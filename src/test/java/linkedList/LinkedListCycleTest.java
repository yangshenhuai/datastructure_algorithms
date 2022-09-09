package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle(){
        ListNode l1 = new ListNode(3);
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(0);
        ListNode l1_3 = new ListNode(-4);

        l1.next = l1_1;
        l1_1.next = l1_2;
        l1_2.next = l1_3;
        l1_3.next = l1_1;

        assertTrue(new LinkedListCycle().hasCycle(l1));

        ListNode l2 = new ListNode(1);
        ListNode l2_1 = new ListNode(2);
        l2.next = l2_1;
        l2_1.next = l2;
        assertTrue(new LinkedListCycle().hasCycle(l2));

        ListNode l3 = new ListNode(1);

        assertFalse(new LinkedListCycle().hasCycle(l3));


    }
}
