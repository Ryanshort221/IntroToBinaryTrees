public class BinaryTree {
    // root of each subtree is said to be a chid of r and r is said to be the parent of each subtree root
    // leaves - nodes with no children external nodes
    // internal nodes nodes with children
    // siblings nodes with the same parent
    // path = number of edges between two nodes
    // pre order - root, left, right
    // in order - left, root, right
    // post order - left, right, root
    // height of a node = number of edges on the longest path between that node and a leaf
    // height of a tree = height of the root
    // depth of a node = number of edges between that node and the root
    // level of a node = depth of a node + 1

    Node root;
    BinaryTree() { root = null; }

    public void preOrderPrint(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    public void inOrderPrint(Node node) {
        if (node == null) return;
        inOrderPrint(node.left);
        System.out.print(node.value + " ");
        inOrderPrint(node.right);
    }

    public void postOrderPrint(Node node) {
        if (node == null) return;
        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.print(node.value + " ");
    }
}
