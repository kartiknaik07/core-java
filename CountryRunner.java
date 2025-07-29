class CountryRunner {
	public static void main(String[] args) {
		Country[] countries = new Country[5];

		Country c1 = new Country();
		c1.setName("India");
		c1.setCapital("New Delhi");
		countries[0] = c1;

		Country c2 = new Country();
		c2.setName("USA");
		c2.setCapital("Washington D.C.");
		countries[1] = c2;

		Country c3 = new Country();
		c3.setName("Japan");
		c3.setCapital("Tokyo");
		countries[2] = c3;

		Country c4 = new Country();
		c4.setName("Australia");
		c4.setCapital("Canberra");
		countries[3] = c4;

		Country c5 = new Country();
		c5.setName("France");
		c5.setCapital("Paris");
		countries[4] = c5;

		for (int i = 0; i < countries.length; i++) {
			Country c = countries[i];
			System.out.println("Country: " + c.getName());
			System.out.println("Capital: " + c.getCapital());
		}
	}
}
