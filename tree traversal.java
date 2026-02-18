public class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }

    static void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        inorder(root);
    }
}
