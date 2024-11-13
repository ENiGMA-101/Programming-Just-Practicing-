package bookapp;

import java.util.*;
import bookstore.Book;
import bookstore.BookStore;
public class BookStoreApp {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore store = new BookStore("The Great Bookstore");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all books");
            System.out.println("2. Order new books");
            System.out.println("3. Sell books");
            System.out.println("4. View discounted price of a book");
            System.out.println("5. View total sales");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the system...");
                break;
            } 
            else if (choice == 1) {
                store.display();
            } 
            else if (choice == 2) {
                System.out.print("Enter book title: ");
                scanner.nextLine(); // consume newline
                String titleOrder = scanner.nextLine();
                System.out.print("Enter book author: ");
                String authorOrder = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter number of copies: ");
                int copiesOrder = scanner.nextInt();
                store.order(titleOrder, authorOrder, price, copiesOrder);
            } 
            else if (choice == 3) {
                System.out.print("Enter book title: ");
                scanner.nextLine(); // consume newline
                String titleSell = scanner.nextLine();
                System.out.print("Enter book author: ");
                String authorSell = scanner.nextLine();
                System.out.print("Enter number of copies to sell: ");
                int copiesSell = scanner.nextInt();
                System.out.print("Enter sale percentage (0 if no discount): ");
                double salePercentage = scanner.nextDouble();
                store.sell(titleSell, authorSell, copiesSell, salePercentage);
            } 
            else if (choice == 4) {
                System.out.print("Enter book title: ");
                scanner.nextLine(); // consume newline
                String titleDiscount = scanner.nextLine();
                System.out.print("Enter book author: ");
                String authorDiscount = scanner.nextLine();
                System.out.print("Enter sale percentage: ");
                float discount = scanner.nextFloat();
                double discountedPrice = store.getDiscountedPrice(titleDiscount, authorDiscount, discount);
                if (discountedPrice != -1) {
                    System.out.println("Discounted price: $" + discountedPrice);
                } else {
                    System.out.println("Book not found.");
                }
            } 
            else if (choice == 5) {
                System.out.println("Total sales: $" + store.getTotalSale());
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}