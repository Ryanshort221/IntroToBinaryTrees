public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        String[] arr1 = { "Apple", "Banana", "Orange", "Grapes", "Pineapple", "Mango", "Peach", "Kiwi", "Strawberry"};
        BinaryTree tree1 = new BinaryTree(arr1);
        int count = tree1.search("peach");
        if (count != -1) {
            System.out.println("Binary Search Tree Element Found After " + count + " Iterations");
        }
        System.out.println("Pre order traversal of binary tree is ");
        tree.preOrderPrint(tree.root);
        System.out.println("\nIn order traversal of binary tree is ");
        tree.inOrderPrint(tree.root);
        System.out.println("\nPost order traversal of binary tree is ");
        tree.postOrderPrint(tree.root);

        int[] arr = { 1, 2, 3, 4, 5 };
        int x = 4;
        LinearSearch.search(arr, x);
        BinarySearch.search(arr, x);

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

        GraphBFS graph = new GraphBFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.BFS(2);
        System.out.println("\n");
        GraphDFS graph1 = new GraphDFS(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 0);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 3);
        graph1.DFS(2);

    }
}
