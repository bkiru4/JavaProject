import java.util.LinkedList;
import java.util.Stack;

public class BFSvsDFS {
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

//           a
//        b     c
//      d  e      f

        LinkedList<Node> queue = new LinkedList();
        Stack result = new Stack();
        System.out.println(bfs(a, queue, result));
    }

    static Stack bfs(Node root, LinkedList<Node> queue, Stack result) {
        if (root == null) {
            return result;
        }
        queue.add(root);
        while (queue.size() > 0) {
            Node current = queue.remove();
            result.push(current.val);
            if (current.left != null) queue.add(current.left);   //BFS  - can't write recursively  m, i;ko
            if (current.right != null) queue.add(current.right); //BFS  - can't write recursively
//   DFS    bfs(current.left, queue,result);
//   DFS    bfs(current.right,queue,result);
        }
        return result;
    }
}
