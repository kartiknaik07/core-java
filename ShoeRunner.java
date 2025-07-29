class ShoeRunner {
	public static void main(String[] args) {
		Shoe[] shoes = new Shoe[5];

		Shoe s1 = new Shoe();
		s1.setBrand("Nike");
		s1.setType("Running");
		shoes[0] = s1;

		Shoe s2 = new Shoe();
		s2.setBrand("Adidas");
		s2.setType("Casual");
		shoes[1] = s2;

		Shoe s3 = new Shoe();
		s3.setBrand("Puma");
		s3.setType("Training");
		shoes[2] = s3;

		Shoe s4 = new Shoe();
		s4.setBrand("Bata");
		s4.setType("Formal");
		shoes[3] = s4;

		Shoe s5 = new Shoe();
		s5.setBrand("Reebok");
		s5.setType("Sneakers");
		shoes[4] = s5;

		for (int i = 0; i < shoes.length; i++) {
			Shoe s = shoes[i];
			System.out.println("Brand: " + s.getBrand());
			System.out.println("Type: " + s.getType());
		}
	}
}
