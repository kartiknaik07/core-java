class FestivalRunner {
	public static void main(String[] args) {
		Festival[] festivals = new Festival[5];

		Festival f1 = new Festival();
		f1.setName("Diwali");
		f1.setCountry("India");

		Festival f2 = new Festival();
		f2.setName("Christmas");
		f2.setCountry("Global");

		Festival f3 = new Festival();
		f3.setName("Thanksgiving");
		f3.setCountry("USA");

		Festival f4 = new Festival();
		f4.setName("Hanami");
		f4.setCountry("Japan");

		Festival f5 = new Festival();
		f5.setName("Oktoberfest");
		f5.setCountry("Germany");

		for(int i = 0; i < festivals.length; i++) {
			if(i == 0) festivals[i] = f1;
			else if(i == 1) festivals[i] = f2;
			else if(i == 2) festivals[i] = f3;
			else if(i == 3) festivals[i] = f4;
			else if(i == 4) festivals[i] = f5;
		}

		for(int i = 0; i < festivals.length; i++) {
			System.out.println("Name: " + festivals[i].getName());
			System.out.println("Country: " + festivals[i].getCountry());
		}
	}
}