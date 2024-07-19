import java.util.Scanner;

class BST {
    int a;
    BST L, R;

    public BST(int ui) {
        a = ui;
        L = R = null;
    }
}

class BinarySearchTree {
    BST root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int a) {
        root = insertRec(root, a);
    }

    BST insertRec(BST root, int a) {
        if (root == null) {
            root = new BST(a);
            return root;
        }
        if (a < root.a)
            root.L = insertRec(root.L, a);
        else if (a > root.a)
            root.R = insertRec(root.R, a);
        return root;
    }

    void deleteKey(int a) {
        root = deleteRec(root, a);
    }

    BST deleteRec(BST root, int a) {
        if (root == null) return root;

        if (a < root.a)
            root.L = deleteRec(root.L, a);
        else if (a > root.a)
            root.R = deleteRec(root.R, a);
        else {
            if (root.L == null)
                return root.R;
            else if (root.R == null)
                return root.L;

            root.a = minValue(root.R);
            root.R = deleteRec(root.R, root.a);
        }
        return root;
    }

    int minValue(BST root) {
        int ex = root.a;
        while (root.L != null) {
            root = root.L;
            ex = root.a;
        }
        return ex;
    }

    BST search(int a) {
        return searchRec(root, a);
    }

    BST searchRec(BST root, int a) {
        if (root == null || root.a == a)
            return root;
        if (root.a > a)
            return searchRec(root.L, a);
        return searchRec(root.R, a);
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(BST root) {
        if (root != null) {
            inorderRec(root.L);
            System.out.print(root.a + " ");
            inorderRec(root.R);
        }
    }

    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(BST root) {
        if (root != null) {
            System.out.print(root.a + " ");
            preorderRec(root.L);
            preorderRec(root.R);
        }
    }

    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(BST root) {
        if (root != null) {
            postorderRec(root.L);
            postorderRec(root.R);
            System.out.print(root.a + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice, a;

        System.out.println("Welcome to my BST program!!!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. In-order Traversal");
            System.out.println("4. Pre-order Traversal");
            System.out.println("5. Post-order Traversal");
            System.out.println("6. Delete");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int n;
                    System.out.print("How many nodes do you want to insert ?: ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the node which you want to insert: ");
                        a = scanner.nextInt();
                        bst.insert(a);
                    }
                    break;

                case 2:
                    System.out.print("Enter key you want to search: ");
                    a = scanner.nextInt();
                    if (bst.search(a) != null) {
                        System.out.println("Found node with key: " + a);
                    } else {
                        System.out.println("Node with key " + a + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("In-order traversal: ");
                    bst.inorder();
                    break;

                case 4:
                    System.out.print("Pre-order traversal: ");
                    bst.preorder();
                    break;

                case 5:
                    System.out.print("Post-order traversal: ");
                    bst.postorder();
                    break;

                case 6:
                    System.out.print("Enter the node which you want to delete: ");
                    a = scanner.nextInt();
                    bst.deleteKey(a);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
