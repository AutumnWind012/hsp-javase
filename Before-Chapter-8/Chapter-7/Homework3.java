public class Homework3 {
	public static void main(String[] args) {

		Book b = new Book("The Wizard of Oz", 122);

		b.updatePrice();

		System.out.println(b.price);	// 100.0
		
	}
}


class Book {

	String name;
	double price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void updatePrice() {
		if (price > 150) {
			price = 150;
		} else if (price > 100) {
			price = 100;
		}
	}
}