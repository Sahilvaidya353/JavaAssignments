package Assignment;

import java.util.Scanner;

public class BubbleSortNames {

    static void bubbleSort(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    static void displayNames(String[] names) {
        System.out.println("Sorted Names");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names you want to sort ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[n];

        System.out.println("Enter " + n + " names");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        bubbleSort(names);
        
        displayNames(names);

    }
}
