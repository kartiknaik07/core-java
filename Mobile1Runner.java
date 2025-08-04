class Mobile1Runner {
	public static void main(String[] args) {
		Mobile1[] mobiles = new Mobile1[5];

		Mobile1 m1 = new Mobile1();
		m1.setBrand("Samsung");
		m1.setModel("Galaxy S21");

		Mobile1 m2 = new Mobile1();
		m2.setBrand("Apple");
		m2.setModel("iPhone 13");

		Mobile1 m3 = new Mobile1();
		m3.setBrand("OnePlus");
		m3.setModel("Nord 3");

		Mobile1 m4 = new Mobile1();
		m4.setBrand("Xiaomi");
		m4.setModel("Redmi Note 12");

		Mobile1 m5 = new Mobile1();
		m5.setBrand("Realme");
		m5.setModel("Narzo 60");

		for(int i = 0; i < mobiles.length; i++) {
			if(i == 0) mobiles[i] = m1;
			else if(i == 1) mobiles[i] = m2;
			else if(i == 2) mobiles[i] = m3;
			else if(i == 3) mobiles[i] = m4;
			else if(i == 4) mobiles[i] = m5;
		}

		for(int i = 0; i < mobiles.length; i++) {
			System.out.println("Brand: " + mobiles[i].getBrand());
			System.out.println("Model: " + mobiles[i].getModel());
		}
	}
}