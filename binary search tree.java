class BST {
    Node root;

    
    boolean searchinBST(int key, Node root) {
        Node curr = root;

        while (curr != null) {
            if (key == curr.d) {
                return true;
            } 
            else if (key > curr.d) {
                curr = curr.r;
            } 
            else {
                curr = curr.l;
            }
        }
        return false;
    }

  
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.d) {
            root.l = insert(root.l, key);
        } 
        else if (key > root.d) {
            root.r = insert(root.r, key);
        }

        return root;
    }

    
    void inorder(Node root) {
        if (root != null) {
            inorder(root.l);       
            System.out.print(root.d + " "); 
            inorder(root.r);       
        }
    }
}

class Node {
    int d;
    Node l, r;

    Node(int d) {
        this.d = d;
        this.l = this.r = null;
    }
}

class Main {
    public static void main(String[] args) {

        BST t = new BST();

        Node a = new Node(40);
        Node b = new Node(20);
        Node c = new Node(60);
        Node d = new Node(15);
        Node e = new Node(30);
        Node f = new Node(50);
        Node g = new Node(70);
        Node h = new Node(10);

        a.l = b;
        a.r = c;
        b.l = d;
        b.r = e;
        c.l = f;
        c.r = g;
        d.l = h;

        a = t.insert(a, 55);

        System.out.print("Inorder");
        t.inorder(a);
        System.out.println();

        System.out.println("Is 30 present? " + t.searchinBST(30, a));
        System.out.println("Is 55 present? " + t.searchinBST(55, a));
    }
}


        
