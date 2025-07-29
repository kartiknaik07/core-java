class Book1Runner {
	public static void main(String[] args) {
		Book1[] books = new Book1[5];

		Book1 b1 = new Book1();
		b1.setTitle("The Alchemist");
		b1.setAuthor("Paulo Coelho");
		books[0] = b1;

		Book1 b2 = new Book1();
		b2.setTitle("Wings of Fire");
		b2.setAuthor("A.P.J Abdul Kalam");
		books[1] = b2;

		Book1 b3 = new Book1();
		b3.setTitle("1984");
		b3.setAuthor("George Orwell");
		books[2] = b3;

		Book1 b4 = new Book1();
		b4.setTitle("The Hobbit");
		b4.setAuthor("J.R.R. Tolkien");
		books[3] = b4;

		Book1 b5 = new Book1();
		b5.setTitle("The Monk Who Sold His Ferrari");
		b5.setAuthor("Robin Sharma");
		books[4] = b5;

		for (int i = 0; i < books.length; i++) {
			Book1 b = books[i];
			System.out.println("Title: " + b.getTitle());
			System.out.println("Author: " + b.getAuthor());
		}
	}
}