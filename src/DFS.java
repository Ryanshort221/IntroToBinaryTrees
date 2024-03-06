public class DFS {
    // implement a depth first search algorithm to search for a node in a binary tree

    public Node dfs(Node root, int x) {
        if (root == null) {
            return null;
        }
        if (root.value == x) {
            return root;
        }
        Node left = dfs(root.left, x);
        if (left != null) {
            return left;
        }
        Node right = dfs(root.right, x);
        if (right != null) {
            return right;
        }
        return null;
    }
}
