package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists(){
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);

        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(4);

        ListNode list2_2 = new ListNode(3);
        ListNode list2_3 = new ListNode(4);
        list1.next = list1_2;
        list1_2.next = list1_3;
        list2.next = list2_2;
        list2_2.next = list2_3;

        ListNode newNode = new MergeTwoSortedLists().mergeTwoLists(list1,list2);
        assertEquals(1,newNode.val);
        assertEquals(1,newNode.next.val);
        assertEquals(2,newNode.next.next.val);
        assertEquals(3,newNode.next.next.next.val);
        assertEquals(4,newNode.next.next.next.next.val);
        assertEquals(4,newNode.next.next.next.next.next.val);
        assertNull(newNode.next.next.next.next.next.next);


        list1 = new ListNode(-9);
        list2 = new ListNode(5);
        list1_2 = new ListNode(3);
        list2_2 = new ListNode(7);
        list1.next = list1_2;
        list2.next = list2_2;
        newNode = new MergeTwoSortedLists().mergeTwoLists(list1,list2);
        assertEquals(-9,newNode.val);
        assertEquals(3,newNode.next.val);
        assertEquals(5,newNode.next.next.val);
        assertEquals(7,newNode.next.next.next.val);

    }
}
