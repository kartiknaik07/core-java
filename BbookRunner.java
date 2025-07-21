class BbookRunner {
	public static void main(String[] args) {
		Bbook b = new Bbook("Java Basics", "John Doe");
		System.out.println("Title: " + b.getTitle());
		System.out.println("Author: " + b.getAuthor());
		System.out.println("==================");
		b.setTitle("Advanced Java");
		System.out.println("Title: " + b.getTitle());
		b.setAuthor("Jane Smith");
		System.out.println("Author: " + b.getAuthor());
	}
}