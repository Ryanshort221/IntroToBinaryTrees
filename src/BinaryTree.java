import java.util.Arrays;
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
    
    public BinaryTree(String[] arr) {
        Arrays.sort(arr);
        root = sortedArrayToBST(arr, 0, arr.length - 1);
    }

    public Node sortedArrayToBST(String arr[], int start, int end) {
        if (start > end) {
            return null;
        }
    
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
    
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }

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

    public int search(String search) {
        int count = searchRec(root, search, 0);
        if (count == -1) {
            System.out.println("Element not found");
            return -1;
        }
        return count;
    }

    private int searchRec(Node node, String search, int count) {
        if (node == null) {
            return -1;
        }
        if (node.value1.equals(search)) {
            return count;
        }
        int left = searchRec(node.left, search, count + 1);
        if (left != -1) {
            return left;
        }
        return searchRec(node.right, search, count + 1);
    }
}
