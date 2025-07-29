class MobileeRunner {
	public static void main(String[] args) {
		Mobilee[] mobiles = new Mobilee[5];

		Mobilee m1 = new Mobilee();
		m1.setBrand("Samsung");
		m1.setModel("Galaxy S21");
		mobiles[0] = m1;

		Mobilee m2 = new Mobilee();
		m2.setBrand("Apple");
		m2.setModel("iPhone 14");
		mobiles[1] = m2;

		Mobilee m3 = new Mobilee();
		m3.setBrand("OnePlus");
		m3.setModel("Nord 3");
		mobiles[2] = m3;

		Mobilee m4 = new Mobilee();
		m4.setBrand("Xiaomi");
		m4.setModel("Redmi Note 12");
		mobiles[3] = m4;

		Mobilee m5 = new Mobilee();
		m5.setBrand("Realme");
		m5.setModel("GT Neo");
		mobiles[4] = m5;

		for (int i = 0; i < mobiles.length; i++) {
			Mobilee m = mobiles[i];
			System.out.println("Brand: " + m.getBrand());
			System.out.println("Model: " + m.getModel());
		}
	}
}
