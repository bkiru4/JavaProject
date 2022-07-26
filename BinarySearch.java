import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearch {
    static class Node {
        String val = "";
        Node left, right;
        Node(String val) {
            this.val = val;
            left = right = null;
        }
    }

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

        System.out.println(binarySearch("Banana", a));
    }

    static boolean binarySearch(String findValue, Node root){
        if(root==null)return false;
        System.out.println(root.val);
        if(root.val == findValue)return true;
        return binarySearch(findValue,root.left)||binarySearch(findValue,root.right);
    }



// DFS mild recursive
//    static boolean binarySearch(String findValue,Node root){
//        if (root == null) return false;
//        Stack<Node> stack = new Stack();
//        stack.push(root);
//        while(stack.size()>0){
//            Node current = stack.pop();
//            System.out.println(current.val);
//            if(current.val.equals(findValue)){
//                return true;
//            }
//            if(binarySearch(findValue,root.left)|| binarySearch(findValue,root.right))return true;
//        }
//        return false;
//    }


//BFS
//    static boolean binarySearch(String findValue,Node root){
//        LinkedList<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while(queue.size()>0){
//            Node current = queue.remove();
//            System.out.println(current.val);
//            if(current.val == findValue) return true;
//            if(current.left!=null) queue.add(current.left);
//            if(current.right!=null) queue.add(current.right);
//        }
//        return false;
//    }


//      DFS Recursive
//    static boolean binarySearch(String findValue, Node root) {
//        if (root == null) return false;
//        if (root.val.equals(findValue))return true;
//        if (binarySearch(findValue, root.left) == true || binarySearch(findValue, root.right) == true) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

}
