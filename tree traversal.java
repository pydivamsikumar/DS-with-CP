class Node{
    int data;
    Node l, r;

    Node(int a){
        data = a;
        l = r = null;
    }

    // Preorder Traversal
    void preorder(Node n){
        if(n == null) return;

        System.out.print(n.data + " ");
        preorder(n.l);
        preorder(n.r);
    }

    // Inorder Traversal
    void inorder(Node n){
        if(n == null) return;

        inorder(n.l);
        System.out.print(n.data + " ");
        inorder(n.r);
    }

    // Postorder Traversal
    void postorder(Node n){
        if(n == null) return;

        postorder(n.l);
        postorder(n.r);
        System.out.print(n.data + " ");
    }
}

public class Main {
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        // linking
        a.l = b;
        a.r = c;
        b.l = d;

        System.out.println("Preorder:");
        a.preorder(a);

        System.out.println("\nInorder:");
        a.inorder(a);

        System.out.println("\nPostorder:");
        a.postorder(a);
    }
}
