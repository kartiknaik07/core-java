class BirdRunner {
	public static void main(String[] args) {
		Bird1[] birds = new Bird1[5];

		Bird1 b1 = new Bird1();
		b1.setName("Parrot");
		b1.setColor("Green");

		Bird1 b2 = new Bird1();
		b2.setName("Peacock");
		b2.setColor("Blue");

		Bird1 b3 = new Bird1();
		b3.setName("Sparrow");
		b3.setColor("Brown");

		Bird1 b4 = new Bird1();
		b4.setName("Crow");
		b4.setColor("Black");

		Bird1 b5 = new Bird1();
		b5.setName("Flamingo");
		b5.setColor("Pink");

		for(int i = 0; i < birds.length; i++) {
			if(i == 0) birds[i] = b1;
			else if(i == 1) birds[i] = b2;
			else if(i == 2) birds[i] = b3;
			else if(i == 3) birds[i] = b4;
			else if(i == 4) birds[i] = b5;
		}

		for(int i = 0; i < birds.length; i++) {
			System.out.println("Name: " + birds[i].getName());
			System.out.println("Color: " + birds[i].getColor());
		}
	}
}