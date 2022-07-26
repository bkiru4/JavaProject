package Finished;

public class TreeSum {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(11);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(2);
        Node f = new Node(1);
        Node g = new Node(-1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(totalSum(a));
    }
    static int totalSum(Node root){
        if(root == null) return 0;
        return root.val+ totalSum(root.left)+ totalSum(root.right);
    }



}
