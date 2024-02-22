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
    }
}
