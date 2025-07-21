class Hotels {
	private String name;
	String city;
	int roomsAvailable;
	float rating;
	public static char classification;

	static {
		System.out.println("Static block in Hotels");
		classification = 'L';
	}

	{
		System.out.println("Non-static block in Hotels");
		classification = 'M';
	}

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
}


