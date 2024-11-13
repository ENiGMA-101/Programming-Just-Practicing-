package bookstore;

public class Book {

	public String bookTitle;
	public String bookAuthor;
	public double price;
	public int numOfCopies;

	public Book(String bookTitle, String bookAuthor, double price, int numOfCopies) {

	this.bookTitle=bookTitle;
	this.bookAuthor=bookAuthor;
	this.price=price;
	this.numOfCopies=numOfCopies;

	}

	double getDiscountPrice(float saleParcentage) {
		return price-((price*saleParcentage)/100);
	
	}
	public void increaseQuantity(int amt) {

	numOfCopies+=amt;

	}
	public void decreaseQuantity(int amt) {
	if(numOfCopies>amt) {
	numOfCopies-=amt;
	}
	else
	{
	   System.out.println("Insufficient");
	}
	}
	
	public String toString() {
		return String.format("Title:%s\nAuthor:%s\nQuantity”:%d",bookTitle,bookAuthor,numOfCopies);

	}
	}

