package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AddTwoNumbersTest {


    @Test
    public void testAddTwoNumbers(){
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);

        l1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);

        l2.next = l2_2;
        l2_2.next = l2_3;

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1,l2);
        assertEquals(7,result.val);
        assertEquals(0,result.next.val);
        assertEquals(8,result.next.next.val);
        assertNull(result.next.next.next);



        ListNode l3 = new ListNode(9);
        ListNode l3_1 = new ListNode(9);
        ListNode l3_2 = new ListNode(9);
        ListNode l3_3 = new ListNode(9);
        ListNode l3_4 = new ListNode(9);
        ListNode l3_5 = new ListNode(9);
        ListNode l3_6 = new ListNode(9);
        l3.next = l3_1;
        l3_1.next = l3_2;
        l3_2.next = l3_3;
        l3_3.next = l3_4;
        l3_4.next = l3_5;
        l3_5.next = l3_6;

        ListNode l4 = new ListNode(9);
        ListNode l4_1 = new ListNode(9);
        ListNode l4_2 = new ListNode(9);
        ListNode l4_3 = new ListNode(9);
        l4.next = l4_1;
        l4_1.next = l4_2;
        l4_2.next = l4_3;


        result = new AddTwoNumbers().addTwoNumbers(l3,l4);

        assertEquals(8,result.val);
        assertEquals(9,result.next.val);
        assertEquals(9,result.next.next.val);
        assertEquals(9,result.next.next.next.val);
        assertEquals(0,result.next.next.next.next.val);
        assertEquals(0,result.next.next.next.next.next.val);
        assertEquals(0,result.next.next.next.next.next.next.val);
        assertEquals(1,result.next.next.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next.next.next);

    }
}
