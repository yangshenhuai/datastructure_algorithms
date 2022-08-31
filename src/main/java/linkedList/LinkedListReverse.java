package linkedList;

public class LinkedListReverse {


    public Node reverse(Node head){
        Node current = head;
        Node pre = null;
        Node next ;
        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        Node reversed = new LinkedListReverse().reverse(n1);
        while (reversed != null){
            System.out.println(reversed.getValue());
            reversed = reversed.next;
        }



    }



}


class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
