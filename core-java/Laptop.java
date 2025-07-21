class Laptop {
    static String brand = "Dell";
    static String processor = "Intel i7";
    static int ram = 16; 
    static int storage = 512; 
    static double price = 75000.50;

    public static void main(String[] args) {
        String b = getBrand();
        String p = getProcessor();
        int r = getRam();
        int s = getStorage();
        double pr = getPrice();

        System.out.println(b);
        System.out.println(p);
        System.out.println(r);
        System.out.println(s);
        System.out.println(pr);
    }

    public static String getBrand() {
        return brand;
    }

    public static String getProcessor() {
        return processor;
    }

    public static int getRam() {
        return ram;
    }

    public static int getStorage() {
        return storage;
    }

    public static double getPrice() {
        return price;
    }
}
