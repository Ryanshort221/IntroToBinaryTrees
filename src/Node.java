public class Node {
    int value;
    String value1;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }

    public Node(String value1) {
        this.value1 = value1;
        left = right = null;
    }
}
