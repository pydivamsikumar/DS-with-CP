class BST {

    Node root;

    class Node {
        int d;
        Node l, r;

        Node(int d) {
            this.d = d;
            this.l = null;
            this.r = null;
        }
    }

    // Insert Method
    void insert(int d) {
        root = insertRec(root, d);
    }

    Node insertRec(Node root, int d) {
        if (root == null) {
            return new Node(d);
        }

        if (d < root.d) {
            root.l = insertRec(root.l, d);
        } else if (d > root.d) {
            root.r = insertRec(root.r, d);
        }

        return root;
    }

    // Search Method
    boolean searchInBST(int key) {
        Node curr = root;

        while (curr != null) {
            if (key == curr.d) {
                return true;
            } else if (key > curr.d) {
                curr = curr.r;
            } else {
                curr = curr.l;
            }
        }

        return false;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println(tree.searchInBST(60)); // true
        System.out.println(tree.searchInBST(25)); // false
    }
}
