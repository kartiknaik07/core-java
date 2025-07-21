class Bike{
	 static String name = "Duke";
	 static String company = "KTM";
	 static float price = 200000;
	 static String color = "Black";
	 static float milage = 35;
	
public static void main(String[] args){
	
	String bikeName=NameofBike();
	String Company = NameofCompany();
	float Price = priceofBike();
	String Color = ColorofBike();
	float Milage = MilageofBike();
	
	System.out.println(bikeName);
	System.out.println(Company);
	System.out.println(Price);
	System.out.println(Color);
	System.out.println(Milage);
}
public static String NameofBike(){
	return name;
}
public static String NameofCompany(){
	return company;
}
public static float priceofBike(){
	return price;
} 
public static String ColorofBike(){
	return color;
}
public static float MilageofBike(){
	return milage;
}
}
