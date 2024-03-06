public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre order traversal of binary tree is ");
        tree.preOrderPrint(tree.root);
        System.out.println("\nIn order traversal of binary tree is ");
        tree.inOrderPrint(tree.root);
        System.out.println("\nPost order traversal of binary tree is ");
        tree.postOrderPrint(tree.root);

        int[] arr = { 1, 2, 3, 4, 5 };
        int x = 4;
        LinearSerach search = new LinearSerach(arr, x);
        int result = search.search();
        if (result != -1) {
            System.out.println("Element found at index " + search);
        } else {
            System.out.println("Element not found");
        }

        DFS dfs = new DFS();
        int find = 4;
        Node nodeResult = dfs.dfs(tree.root, find);
        if (nodeResult != null) {
            System.out.println("Node found");
        } else {
            System.out.println("Node not found");
        }

        BFS bfs = new BFS();
        Node nodeResult1 = bfs.bfs(tree.root, find);
        if (nodeResult1 != null) {
            System.out.println("Node found");
        } else {
            System.out.println("Node not found");
        }
    }
}
