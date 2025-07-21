class Cinemas {
	private String name;
	String location;
	int totalScreens;
	float ticketPrice;
	public static String type;

	static {
		System.out.println("Static block in Cinemas");
		type = "Multiplex";
	}

	{
		System.out.println("Non-static block in Cinemas");
		type = "Single Screen";
	}

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
}


