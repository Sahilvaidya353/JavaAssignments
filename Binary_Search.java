package sorting;
import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }
}

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree obj = new BinarySearchTree();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a Binary Search Tree");
            System.out.println("2. Traverse in Preorder");
            System.out.println("3. Traverse in Postorder");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter values separated by spaces to insert into BST: ");
                    scanner.nextLine();
                    String[] values = scanner.nextLine().split(" ");
                    for (String value : values) {
                        obj.insert(Integer.parseInt(value));
                    }
                    System.out.println("BST created successfully!");
                    break;

                case 2:
                    System.out.println("Preorder traversal in binary search");
                    obj.preorder(obj.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Postorder traversal in binary search");
                    obj.postorder(obj.root);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
