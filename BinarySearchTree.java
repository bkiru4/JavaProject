package Finished;

import java.util.Stack;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node a = new Node("Apple");
        Node b = new Node("Banana");
        Node c = new Node("Cucumber");
        Node d = new Node("Dhal");
        Node e = new Node("EggPlant");
        Node f = new Node("Fries");
        Node g = new Node("");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        depthFirstValues(g); // null array
        depthFirstValues(a);
    }

    static void depthFirstValues(Node root){
        Stack<Node> stack = new Stack<Node>();
        Stack result = new Stack();
        stack.push(root);

        while(stack.size()>0){
            Node current = stack.pop();
            result.push(current.val);
            if(current.right != null) {stack.push(current.right);}
            if(current.left != null) {stack.push(current.left);}
        }
        System.out.println(result);
    }

    static class Node {  //remove static if you want to take out of class
        String val;
        Node left, right;
        Node(String val) {
            this.val = val;
            left = null; right = null;
        }
    }
}

