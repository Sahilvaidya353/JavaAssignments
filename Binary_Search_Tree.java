package Assignment;

public class Binary_Search_Tree {

	    Tree_Node root;

	    Binary_Search_Tree() {
	        root = null;
	    }

	    void insert(int value) {
	        root = insertRec(root, value);
	    }

	    Tree_Node insertRec(Tree_Node root, int value) {
	        if (root == null) {
	            return new Tree_Node(value);
	        }
	        if (value < root.value) {
	            root.left = insertRec(root.left, value);
	        } else if (value > root.value) {
	            root.right = insertRec(root.right, value);
	        }
	        return root;
	    }

	    void inorderTraversal(Tree_Node node) {
	        if (node != null) {
	            inorderTraversal(node.left);
	            System.out.print(node.value + " ");
	            inorderTraversal(node.right);
	        }
	    }

	    Tree_Node deleteNode(Tree_Node root, int value) {
	        if (root == null) {
	            return root;
	        }
	        if (value < root.value) {
	            root.left = deleteNode(root.left, value);
	        } else if (value > root.value) {
	            root.right = deleteNode(root.right, value);
	        } else {
	           
	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null) {
	                return root.left;
	            }

	           
	            root.value = minValue(root.right);

	            root.right = deleteNode(root.right, root.value);
	        }
	        return root;
	    }

	    int minValue(Tree_Node node) {
	        int minValue = node.value;
	        while (node.left != null) {
	            minValue = node.left.value;
	            node = node.left;
	        }
	        return minValue;
	    }
	}

