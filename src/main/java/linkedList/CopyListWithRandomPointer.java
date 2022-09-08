package linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 *
 *
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 *
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 *
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
 *
 * Return the head of the copied linked list.
 *
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 *
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
 * Your code will only be given the head of the original linked list.
 */
public class CopyListWithRandomPointer {

    public RNode copyRandomList(RNode head) {

        RNode result = new RNode(-1);
        Map<RNode,RNode> randomNodeMap = new HashMap<>();
        Map<RNode,RNode> headReleationShipMap = new HashMap<>();
        RNode traveralNode = new RNode(head.val);
        RNode previousNode = traveralNode;
        randomNodeMap.put(head.random,traveralNode);
        headReleationShipMap.put(head,head.random);
        result.next = traveralNode;
        head = head.next;
        while (head!=null){
            traveralNode = new RNode(head.val);
            randomNodeMap.put(head.random,traveralNode);
            headReleationShipMap.put(head,head.random);
            previousNode.next = traveralNode;
            if (randomNodeMap.containsKey(head)){
                randomNodeMap.get(head).random = traveralNode;
            }
            if (head.random != null){
                traveralNode.random = headReleationShipMap.get(head);
            }

            previousNode = traveralNode;
            head = head.next;
        }


        return result.next;
    }


    public RNode copyRandomList2(RNode head) {

        RNode result = new RNode(-1);

        Map<Integer,RNode> newIdxToNodeMap = new HashMap<>();
        Map<RNode,Integer> nodeToIdxMap = new HashMap<>();
        Map<RNode, List<Integer>> randomNodeToIdxMap = new HashMap<>();

        int idx = 0;

        RNode traverseNode ;
        RNode previousNode = null;
        boolean flag = true;
        while (head != null) {
            traverseNode = new RNode(head.val);
            if (flag){
                result.next = traverseNode;
                flag = false;
            }
            nodeToIdxMap.put(head,idx);
            newIdxToNodeMap.put(idx,traverseNode);
            if (head.random != null){
                randomNodeToIdxMap.computeIfAbsent(head.random, k-> new ArrayList<>()).add(idx);
            }

            if (randomNodeToIdxMap.containsKey(head)){
                for (int i : randomNodeToIdxMap.get(head)){
                    newIdxToNodeMap.get(i).random = traverseNode;
                }
            }

            if (nodeToIdxMap.containsKey(head.random)){
                traverseNode.random = newIdxToNodeMap.get(nodeToIdxMap.get(head.random));
            }

            if (previousNode != null){
                previousNode.next = traverseNode;
            }
            previousNode = traverseNode;
            head = head.next;
            idx++;
        }

        return result.next;
    }

}
class RNode {
    int val;
    RNode next;
    RNode random;

    public RNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
