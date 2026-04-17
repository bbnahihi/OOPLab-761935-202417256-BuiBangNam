package hust.soict.vietphap.aims;

import java.util.Scanner;
import hust.soict.vietphap.aims.cart.Cart;
import hust.soict.vietphap.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    System.out.println("Update store feature coming soon...");
                    break;
                case 3:
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("\n--- AIMS MAIN MENU ---");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu() {
        int choice;
        do {
            System.out.println("\n--- STORE MENU ---");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.print("Please choose a number: 0-1-2-3-4: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 4) {
                cart.print();
            }
        } while (choice != 0);
    }

    public static void cartMenu() {
        int choice;
        do {
            System.out.println("\n--- CART MENU ---");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.print("Please choose a number: 0-1-2-3-4-5: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 2) {
                System.out.println("1. Sort by Title-Cost | 2. Sort by Cost-Title");
                int sortChoice = scanner.nextInt();
                if (sortChoice == 1) cart.sortByTitleCost();
                else if (sortChoice == 2) cart.sortByCostTitle();
                cart.print();
            } else if (choice == 5) {
                System.out.println("An order has been created. The cart will be emptied.");
                cart = new Cart();
                break;
            }
        } while (choice != 0);
    }
}