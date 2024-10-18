package Assignment;

import java.util.Scanner;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Enter the number of elements in the list ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        System.out.println("Alternate Nodes in the List");
        list.displayAlternateNodes();
        System.out.println();

    }
}
