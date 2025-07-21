class Laptopp{
	String name;
	float price;
	int storage;
	String features;
	//default constructor/no argument constructor
	public Laptopp(){
		
	}
	public void setName(String laptopName){
		name = laptopName;
	}
	public static void main(String[] args){
		//Laptopp.variablename
		
		Laptopp laptop = new Laptopp();
		laptop.name = "Lenovo";
		System.out.println(laptop.name);
		laptop.setName("HP");
		System.out.println(laptop.name);
		
		Laptopp laptop1 = new Laptopp();
		laptop1.name = "Dell";
		laptop1.setName("Dell");
		System.out.println(laptop1.name);
		System.out.println(laptop.name);
		
		
		//classname variablename = new classname();
		//constructor
    
	
		
	 /**/
	}
}
