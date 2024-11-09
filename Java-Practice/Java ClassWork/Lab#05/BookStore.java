package bookstore;

import java.util.*;

public class BookStore {

	String name;
	double totalSale;
	ArrayList<Book> books = new ArrayList<>();

	public BookStore(String name) {

	}

	void sell(String bookTitle, String author, int numOfCopies, double salePercentage) {

		Book b = findBook(bookTitle, author);

		if (b != null) {

			b.decreaseQuantity(numOfCopies);

			double np = (b.getDiscountPrice((float) salePercentage)) * numOfCopies;

			totalSale += np;

		}

		else {

			System.out.println("The book is not found");

		}

	}

	void order(String bookTitle, String author, double price, int numOfCopies) {

		Book a = findBook(bookTitle, author);

		if (a != null) {
			a.increaseQuantity(numOfCopies);
		} else {
			books.add(new Book(bookTitle, author, price, numOfCopies));
		}

	}

	private Book findBook(String bookTitle, String Author) {

		for (Book i : books) {

			if (i.bookTitle.equals(bookTitle) && i.bookAuthor.equals(Author)) {
				return i;
			}
		}

		return null;
	}

	double getDiscountedPrice(String bookTitle, String Author, double salePercentage) {

		Book b = findBook(bookTitle, Author);

		if (b != null) {
			return b.getDiscountPrice((float) salePercentage);
		}

		return -1;

	}

	double getTotalSale() {
		return totalSale;

	}

	void display() {

		for (Book i : books) {
			System.out.println(i.toString());
		}

	}
}
