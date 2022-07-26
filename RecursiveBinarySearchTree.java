package Finished;

import java.util.Stack;

public class RecursiveBinarySearchTree {
    static class Node{ //class belongs to parent class because of word STATIC
        String val;
        Node left,right;
        Node(String val){
            this.val =val;
            left=null;
            right=null;
        }
    }
     public static void main(String[] args){
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
         Stack result = new Stack();
         System.out.println(dfs(a,result));
    }
    static Stack dfs(Node root,Stack result){
        if(root == null){return result;}
        result.push(root.val);
        dfs(root.left,result);
        dfs(root.right,result);
        return result;
    }

}
