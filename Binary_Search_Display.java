package Assignment;


public class Binary_Search_Display {
	  Tree_Node root;
	  
	      Binary_Search_Display() {
	          root = null;
	      }
	  
	      void insert(int value) {
	          root = insert(root, value);
	      }
	  
	      Tree_Node insert(Tree_Node current, int value) {
	          if (current == null) {
	              return new Tree_Node(value);
	          }
	          if (value < current.value) {
	              current.left = insert(current.left, value);
	          } else if (value > current.value) {
	              current.right = insert(current.right, value);
	          }
	          return current;
	      }
	  
	      void levelOrderTraversal() {
	          int height = getHeight(root);
	          for (int i = 1; i <= height; i++) {
	              printCurrentLevel(root, i);
	          }
	      }
	  
	      int getHeight(Tree_Node node) {
	          if (node == null) {
	              return 0;
	          } else {
	              int leftHeight = getHeight(node.left);
	              int rightHeight = getHeight(node.right);
	              return Math.max(leftHeight, rightHeight) + 1;
	          }
	      }
	  
	      void printCurrentLevel(Tree_Node node, int level) {
	          if (node == null) {
	              return;
	          }
	          if (level == 1) {
	              System.out.print(node.value + " ");
	          } else {
	              printCurrentLevel(node.left, level - 1);
	              printCurrentLevel(node.right, level - 1);
	          }
	      }
}
