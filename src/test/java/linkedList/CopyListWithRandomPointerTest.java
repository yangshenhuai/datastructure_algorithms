package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CopyListWithRandomPointerTest {


    @Test
    public void testCopyRandomList(){

        RNode head = new RNode(1);
        RNode node2 = new RNode(2);
        RNode node3 = new RNode(3);
        RNode node4 = new RNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        head.random = node3;
        node2.random = node4;
        node3.random = null;
        node4.random = head;
        RNode cpNode = new CopyListWithRandomPointer().copyRandomList2(head);
        assertEquals(1,cpNode.val);
        assertEquals(2,cpNode.next.val);
        assertEquals(3,cpNode.random.val);
        assertEquals(3,cpNode.next.next.val);
        assertEquals(4,cpNode.next.random.val);
        assertEquals(4,cpNode.next.next.next.val);
        assertEquals(1,cpNode.next.next.next.random.val);


        head = new RNode(1);
        node2 = new RNode(2);

        head.random = head;
        node2.random = head;
        head.next = node2;

        cpNode = new CopyListWithRandomPointer().copyRandomList2(head);
        assertEquals(1,cpNode.val);
        assertEquals(2,cpNode.next.val);
        assertEquals(1,cpNode.random.val);
        assertEquals(1,cpNode.next.random.val);


        head = new RNode(1);
        node2 = new RNode(2);

        head.random = node2;
        node2.random = node2;
        head.next = node2;

        cpNode = new CopyListWithRandomPointer().copyRandomList2(head);
        assertEquals(1,cpNode.val);
        assertEquals(2,cpNode.next.val);
        assertEquals(2,cpNode.random.val);
        assertEquals(2,cpNode.next.random.val);


    }
}
