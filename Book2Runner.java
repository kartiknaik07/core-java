class Book2Runner {
	public static void main(String[] args) {
		Book2[] books = new Book2[5];

		Book2 b1 = new Book2();
		b1.setTitle("Wings of Fire");
		b1.setAuthor("A.P.J. Abdul Kalam");

		Book2 b2 = new Book2();
		b2.setTitle("The Alchemist");
		b2.setAuthor("Paulo Coelho");

		Book2 b3 = new Book2();
		b3.setTitle("1984");
		b3.setAuthor("George Orwell");

		Book2 b4 = new Book2();
		b4.setTitle("Harry Potter");
		b4.setAuthor("J.K. Rowling");

		Book2 b5 = new Book2();
		b5.setTitle("Mahabharata");
		b5.setAuthor("Vyasa");

		for(int i = 0; i < books.length; i++) {
			if(i == 0) books[i] = b1;
			else if(i == 1) books[i] = b2;
			else if(i == 2) books[i] = b3;
			else if(i == 3) books[i] = b4;
			else if(i == 4) books[i] = b5;
		}

		for(int i = 0; i < books.length; i++) {
			System.out.println("Title: " + books[i].getTitle());
			System.out.println("Author: " + books[i].getAuthor());
		}
	}
}
