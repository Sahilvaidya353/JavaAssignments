package Assignment;

import java.util.Scanner;

public class Binary_Search_Display_Main {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Binary_Search_Display obj = new Binary_Search_Display();

      System.out.print("Enter the number of integers you want to insert: ");
      int n = scanner.nextInt();

      System.out.println("Enter " + n + " integers");
      for (int i = 0; i < n; i++) {
          int value = scanner.nextInt();
          obj.insert(value);
      }

      System.out.println("Level Order Traversal of the BST");
      obj.levelOrderTraversal();
      System.out.println();

  }
}
