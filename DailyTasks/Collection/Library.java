
//Implement a library book tracker using LinkedHashSet.

package Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        LinkedHashSet<String> books = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    if (books.add(title)) {
                        System.out.println("Book added!");
                    } else {
                        System.out.println("Book already exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = sc.nextLine();
                    if (books.remove(removeTitle)) {
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.println("Books in Library:");
                    for (String book : books) {
                        System.out.println(book);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
