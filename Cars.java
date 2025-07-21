class Cars {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.brand = "Toyota";
        System.out.println(c1.brand);
        c1.model = "Fortuner";
        System.out.println(c1.model);

        Cars c2 = new Cars();
        c2.brand = "Honda";
        System.out.println(c2.brand);
        c2.model = "City";
        System.out.println(c2.model);

        Cars c3 = new Cars();
        c3.brand = "Ford";
        System.out.println(c3.brand);
        c3.model = "Endeavour";
        System.out.println(c3.model);

        Cars c4 = new Cars();
        c4.brand = "Mahindra";
        System.out.println(c4.brand);
        c4.model = "XUV700";
        System.out.println(c4.model);

        Cars c5 = new Cars();
        c5.brand = "Tata";
        System.out.println(c5.brand);
        c5.model = "Harrier";
        System.out.println(c5.model);

        Cars c6 = new Cars();
        c6.brand = "Kia";
        System.out.println(c6.brand);
        c6.model = "Seltos";
        System.out.println(c6.model);

        Cars c7 = new Cars();
        c7.brand = "Hyundai";
        System.out.println(c7.brand);
        c7.model = "Creta";
        System.out.println(c7.model);

        Cars c8 = new Cars();
        c8.brand = "MG";
        System.out.println(c8.brand);
        c8.model = "Hector";
        System.out.println(c8.model);

        Cars c9 = new Cars();
        c9.brand = "Renault";
        System.out.println(c9.brand);
        c9.model = "Duster";
        System.out.println(c9.model);

        Cars c10 = new Cars();
        c10.brand = "Nissan";
        System.out.println(c10.brand);
        c10.model = "Magnite";
        System.out.println(c10.model);

        c1.setCar("BMW", "X5", 2023, 7500000, "Black");
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.price);
        System.out.println(c1.color);
    }

    public void setCar(String b, String m, int y, double p, String c) {
        brand = b;
        model = m;
        year = y;
        price = p;
        color = c;
    }
}
