class Books {
    String title;
    String author;
    int pages;
    double price;
    String publisher;

    public static void main(String[] args) {
        Books b1 = new Books();
        b1.title = "Java Basics";
        System.out.println(b1.title);
        b1.author = "James Gosling";
        System.out.println(b1.author);

        Books b2 = new Books();
        b2.title = "Python Guide";
        System.out.println(b2.title);
        b2.author = "Guido van Rossum";
        System.out.println(b2.author);

        Books b3 = new Books();
        b3.title = "C++ Primer";
        System.out.println(b3.title);
        b3.author = "Bjarne Stroustrup";
        System.out.println(b3.author);

        Books b4 = new Books();
        b4.title = "Data Structures";
        System.out.println(b4.title);
        b4.author = "Mark Allen Weiss";
        System.out.println(b4.author);

        Books b5 = new Books();
        b5.title = "Algorithms";
        System.out.println(b5.title);
        b5.author = "CLRS";
        System.out.println(b5.author);

        Books b6 = new Books();
        b6.title = "Operating Systems";
        System.out.println(b6.title);
        b6.author = "Abraham Silberschatz";
        System.out.println(b6.author);

        Books b7 = new Books();
        b7.title = "DBMS";
        System.out.println(b7.title);
        b7.author = "Raghu Ramakrishnan";
        System.out.println(b7.author);

        Books b8 = new Books();
        b8.title = "Computer Networks";
        System.out.println(b8.title);
        b8.author = "Andrew S. Tanenbaum";
        System.out.println(b8.author);

        Books b9 = new Books();
        b9.title = "AI Basics";
        System.out.println(b9.title);
        b9.author = "Stuart Russell";
        System.out.println(b9.author);

        Books b10 = new Books();
        b10.title = "Machine Learning";
        System.out.println(b10.title);
        b10.author = "Tom Mitchell";
        System.out.println(b10.author);

        b1.setBook("New Book", "New Author", 500, 599.99, "New Publisher");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.pages);
        System.out.println(b1.price);
        System.out.println(b1.publisher);
    }

    public void setBook(String t, String a, int p, double pr, String pub) {
        title = t;
        author = a;
        pages = p;
        price = pr;
        publisher = pub;
    }
}
