import java.util.LinkedList;
import java.util.Queue;
public class BFS {
    public Node bfs(Node root, int x) {
        // implement a breadth first search algorithm to search for a node in a binary tree
                if (root == null) {
                    return null;
                }
                Queue<Node> queue = new LinkedList<>();
                queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.value == x) {
                return current;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return null;
    }
}
