class Car{
	static String name = "Curv";
    static String company = "Tata";
    static double price = 1000000; 
    static int milage  = 30;
    static String color = "white";
	
	
	public static void main(String[] args){
	    String name = "Veetara Breeza";
        String company = "Suzuki";
        double price = 1200000;
        int milage  = 35;
        String color = "grey";
		
		System.out.println(name);
		System.out.println(company);
		System.out.println(price);
		System.out.println(milage);
		System.out.println(color);
		
		getname();
		getcompany();
		getprice();
		getmilage();
		getcolor();
		
		System.out.println(Car.name);
		
		
	}
	public static void getname(){
		System.out.println(name);
	}
	public static void getcompany(){
		System.out.println(company);
	}
	public static void getprice(){
		System.out.println(price);
	}
	public static void getmilage(){
		System.out.println(milage);
	}
	public static void getcolor(){
		System.out.println(color);
	}
}
