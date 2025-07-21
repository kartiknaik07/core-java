class Book {
    static String title = "Java Programming";
    static String author = "James Gosling";
    static int pages = 550;
    static double price = 599.50;
    static char rating = 'A';

    public static void main(String[] args) {
        String t = getTitle();
        String a = getAuthor();
        int p = getPages();
        double pr = getPrice();
        char r = getRating();

        System.out.println(t);
        System.out.println(a);
        System.out.println(p);
        System.out.println(pr);
        System.out.println(r);
    }

    public static String getTitle() {
        return title;
    }

    public static String getAuthor() {
        return author;
    }

    public static int getPages() {
        return pages;
    }

    public static double getPrice() {
        return price;
    }

    public static char getRating() {
        return rating;
    }
}
