class Gyms {
	private String name;
	String location;
	int equipmentCount;
	float rating;
	public static char type;

	static {
		System.out.println("Static block in Gyms");
		type = 'P'; // P for Premium
	}

	{
		System.out.println("Non-static block in Gyms");
		type = 'R'; // R for Regular
	}

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
}


