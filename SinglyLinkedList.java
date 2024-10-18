package Assignment;

public class SinglyLinkedList {
	 Node root;

	    void add(int data) {
	        Node newNode = new Node(data);
	        if (root == null) {
	        	root = newNode;
	        } else {
	            Node current =root;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
	    
	    void displayAlternateNodes() {
	        Node current = root;
	        boolean alternate = true;

	        while (current != null) {
	            if (alternate) {
	                System.out.print(current.data + " ");
	            }
	            alternate = !alternate; 
	            current = current.next;
	        }
	    }
}
