class Restaurants {
	private String name;
	String location;
	int seatingCapacity;
	float rating;
	public static char category;
	
	static {
		System.out.println("Static block in Restaurant");
		category = 'A';
	}
	
	{
		System.out.println("non Static block in Restaurant");
		category = 'B';
	}
	
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
}
	
	