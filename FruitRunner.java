class FruitRunner {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[5];

		Fruit f1 = new Fruit();
		f1.setName("Mango");
		f1.setTaste("Sweet");

		Fruit f2 = new Fruit();
		f2.setName("Lemon");
		f2.setTaste("Sour");

		Fruit f3 = new Fruit();
		f3.setName("Orange");
		f3.setTaste("Citrus");

		Fruit f4 = new Fruit();
		f4.setName("Banana");
		f4.setTaste("Sweet");

		Fruit f5 = new Fruit();
		f5.setName("Guava");
		f5.setTaste("Mild Sweet");

		for(int i = 0; i < fruits.length; i++) {
			if(i == 0) fruits[i] = f1;
			else if(i == 1) fruits[i] = f2;
			else if(i == 2) fruits[i] = f3;
			else if(i == 3) fruits[i] = f4;
			else if(i == 4) fruits[i] = f5;
		}

		for(int i = 0; i < fruits.length; i++) {
			System.out.println("Name: " + fruits[i].getName());
			System.out.println("Taste: " + fruits[i].getTaste());
		}
	}
}