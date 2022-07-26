package Finished;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basicGraph {
 public static void main(String[] args){
        Graph graph = new Graph();

        graph.addNode(new Node('a')); //0
        graph.addNode(new Node('b')); //1
        graph.addNode(new Node('c')); //2
        graph.addNode(new Node('d')); //3
        graph.addNode(new Node('e')); //4
        graph.addNode(new Node('f')); //5

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,5);

        graph.print();
        System.out.println();
        System.out.println("DFS PRINT ORDER using Stack");
        Node src = graph.graphList.get(0).get(0);
        dfsPrint(graph, src);
        dfsPrintRecursive(graph,src);
        bfsPrint(graph, src);
    }
    static void dfsPrint(Graph graph, Node src) {
        Stack<Node> stack = new Stack<>();
        stack.push(src);

        while(stack.size() > 0){
            Node currentNode = stack.pop();
            System.out.println(currentNode.data+"("+ currentNode.index+")");


            for(Node adjNode : graph.graphList.get(currentNode.index)) {
                if (adjNode == currentNode) {
                } else {
                    stack.push(adjNode);
                }
            }

        }
    }
    static void dfsPrintRecursive(Graph graph, Node src){
        System.out.println(src.data);
        for(Node adjNode : graph.graphList.get(src.index)){
            if(src == adjNode){
            }else{
                dfsPrintRecursive(graph, adjNode);
            }
        }
    }

    static void bfsPrint(Graph graph, Node src){
        Queue<Node> queue = new LinkedList<>();
        queue.add(src);
        System.out.println(queue.poll());
        while(queue.size()>0){
            Node currentNode = queue.remove();
            System.out.printf("%s (%d)%n",currentNode.data,currentNode.index);
            for(Node adjNode : graph.graphList.get(currentNode.index)){
                if(currentNode != adjNode){
                    queue.add(adjNode);
                }
            }
        }
    }
    static class Node{
        char data;
        static int count = 0;
        int index;
        Node(char data){
            this.data = data;
            this.index = count;
            count++;
        }
    }
    static class Graph{
        ArrayList<LinkedList<Node>> graphList;

        Graph(){
            graphList = new ArrayList<>();
        }

        public void addNode(Node node){
            LinkedList<Node> currentList = new LinkedList<>();
            currentList.add(node);
            graphList.add(currentList);
        }
        public void addEdge(int start, int end){
            LinkedList<Node> currentList = graphList.get(start);
            Node endNode =  graphList.get(end).get(0);
            currentList.add(endNode);
        }
        public boolean checkEdge(int start, int end){
            LinkedList<Node> currentList = graphList.get(start);
            Node endNode = graphList.get(end).get(0);

            for(Node node : currentList){
                if(node == endNode){
                    return true;
                }
            }
            return false;
        }
        public void print(){
            for(LinkedList<Node> currentList : graphList){
                for(Node node: currentList){
                    System.out.print(node.data+"("+node.index+")" +" -> ");
                }
                System.out.println();
            }
        }

    }
}
