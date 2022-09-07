package linkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListTest {


    @Test
    public void testRemoveNthFromEnd(){
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);


        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;


        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(list1,2);
        assertEquals(1,list1.val);
        assertEquals(2,list1.next.val);
        assertEquals(3,list1.next.next.val);
        assertEquals(5,list1.next.next.next.val);
        assertNull(list1.next.next.next.next);
    }

}
