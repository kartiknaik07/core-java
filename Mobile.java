class Mobile {
    static String brand = "Samsung";
    static String model = "Galaxy S23";
    static double price = 69999.99;
    static boolean is5G = true;
    static double screenSize = 6.5;

    public static void main(String[] args) {
        String b = getBrand();
        String m = getModel();
        double p = getPrice();
        boolean g = getIs5G();
        double s = getScreenSize();

        System.out.println(b);
        System.out.println(m);
        System.out.println(p);
        System.out.println(g);
        System.out.println(s);
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static double getPrice() {
        return price;
    }

    public static boolean getIs5G() {
        return is5G;
    }

    public static double getScreenSize() {
        return screenSize;
    }
}
