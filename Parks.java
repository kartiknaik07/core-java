class Parks {
	private String name;
	String location;
	int areaInAcres;
	float entryFee;
	public static String category;

	static {
		System.out.println("Static block in Parks");
		category = "Public";
	}

	{
		System.out.println("Non-static block in Parks");
		category = "Botanical";
	}

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
}


