package Assignment;

import java.util.Scanner;

public class Binary_Search_Tree_Main {
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Binary_Search_Tree obj = new Binary_Search_Tree();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Create a Binary Search Tree");
	            System.out.println("2. Display the BST Inorder");
	            System.out.println("3. Delete a given element from BST");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter values separated by spaces to insert into BST: ");
	                    scanner.next();
	                    String[] values = scanner.next().split(" ");
	                    for (String value : values) {
	                        obj.insert(Integer.parseInt(value));
	                    }
	                    System.out.println("BST created successfully!");
	                    break;

	                case 2:
	                    System.out.println("BST Inorder Traversal:");
	                    obj.inorderTraversal(obj.root);
	                    System.out.println();
	                    break;

	                case 3:
	                    System.out.print("Enter the value to delete: ");
	                    int valueToDelete = scanner.nextInt();
	                    obj.root = obj.deleteNode(obj.root, valueToDelete);
	                    System.out.println("Value deleted (if it existed)!");
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
	
}
	        
	    

