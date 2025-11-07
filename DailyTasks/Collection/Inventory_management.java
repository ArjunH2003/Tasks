
//Implement a product inventory management using hashset

package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Inventory_management {
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    if (products.add(name)) {
                        System.out.println("Product added!");
                    } else {
                        System.out.println("Product already exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = sc.nextLine();
                    if (products.remove(removeName)) {
                        System.out.println("Product removed!");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    System.out.println("Products in Inventory:");
                    for (String prod : products) {
                        System.out.println(prod);
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
