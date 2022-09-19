package linkedList;

import java.util.HashMap;

import java.util.Map;

public class LRUCache {

    private Map<Integer,DoubleNode> cache;
    int capacity;
    DoubleNode left = new DoubleNode(-1,-1);
    DoubleNode right = new DoubleNode(-1,-1);


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        DoubleNode node = cache.get(key);

        if (node == null){
            return -1;
        }
        remove(node);
        add(node);

        return node.val;
    }

    public void put(int key, int value) {
        DoubleNode newNode = new DoubleNode(key,value);

        if (cache.containsKey(key)){

            remove(cache.get(key));
            add(newNode);
            cache.put(key,newNode);
        }
        else if (cache.size() < capacity){

            add(newNode);
            cache.put(key,newNode);
        } else {
            //remove the oldest
            cache.remove(left.next.key);
            remove(left.next);
            add(newNode);
            cache.put(key,newNode);
        }

    }

    private void remove(DoubleNode node) {
        DoubleNode pre = node.pre;
        DoubleNode next = node.next;
        pre.next = node.next;
        next.pre = pre;
    }

    private void add(DoubleNode node){
        if (right.pre != null){
            right.pre.next = node;
            node.pre = right.pre;
        }
        if (left.next == null){
            left.next = node;
            node.pre = left;
        }
        right.pre = node;
        node.next = right;
    }


}


class DoubleNode{
    int key;
    int val;
    DoubleNode pre;
    DoubleNode next;

    DoubleNode(int key,int val){
        this.key = key;
        this.val = val;
    }
}