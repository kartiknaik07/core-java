class Mobiles{
	static String brand = "Samsung";
    static String model = "Galaxy S23";
    static double price = 69999.99;
    static boolean is5G = true;
    static double screenSize = 6.7;
	
	
	public static void main(String[] args){
		String brand = "OnePlus";
        String model = "Nord 3 5G";
        double price = 19999.99;
        boolean is5G = true;
        double screenSize = 6.5;
		
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(is5G);
		System.out.println(screenSize);
		
		getbrand();
		getmodel();
		getprice();
		getis5G();
		getscreensize();
		
	}
	public static void getbrand(){
		System.out.println(brand);
	}
	public static void getmodel(){
		System.out.println(model);
	}
	public static void getprice(){
		System.out.println(price);
	}
	public static void getis5G(){
		System.out.println(is5G);
	}
	public static void getscreensize(){
	    System.out.println(screenSize);
	}
}