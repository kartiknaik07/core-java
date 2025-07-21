class Laptops{
	static String brand = "Dell";
    static String processor = "Intel i7";
    static int ram = 16; 
    static int storage = 512; 
    static double price = 75000.50;
	
	public static void main(String[] args){
	    String brand = "hp";
        String processor = "Intel i5";
        int ram = 8; 
        int storage = 258; 
        double price = 52000.50;
		
		System.out.println(brand);
		System.out.println(processor);
		System.out.println(ram);
		System.out.println(storage);
		System.out.println(price);
		
		getbrand();
		getprocessor();
		getram();
		getstorage();
		getprice();
		
	}
	public static void getbrand(){
		System.out.println(brand);
	}
	public static void getprocessor(){
		System.out.println(processor);
	}
	public static void getram(){
		System.out.println(ram);
	}
	public static void getstorage(){
		System.out.println(storage);
	}
	public static void getprice(){
		System.out.println(price);
	}
}
