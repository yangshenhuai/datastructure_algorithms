package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    class Node{
        private int i ;

        private List<Node> adjList;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public List<Node> getAdjList() {
            return adjList;
        }

        public void setAdjList(List<Node> adjList) {
            this.adjList = adjList;
        }
    }



    private List<Node> bfs(Node node){

        List<Node> nodes = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();


        nodes.add(node);
        queue.offer(node);
        while (!queue.isEmpty()){
            Node n = queue.poll();
            nodes.add(n);
            if(n.getAdjList() != null){
              for (Node na :n.getAdjList()){
                  queue.offer(na);
              }
            }
        }
        return nodes;
    }


    public static void main(String[] args) {

        //TODO
//        Node n1 = new Node()


    }


}
