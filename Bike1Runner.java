class Bike1Runner {
	public static void main(String[] args) {
		Bike1[] bikes = new Bike[5];

		Bike1 b1 = new Bike1();
		b1.setBrand("Honda");
		b1.setModel("Shine");
		bikes[0] = b1;

		Bike1 b2 = new Bike1();
		b2.setBrand("Hero");
		b2.setModel("Splendor");
		bikes[1] = b2;

		Bike1 b3 = new Bike1();
		b3.setBrand("Yamaha");
		b3.setModel("FZ");
		bikes[2] = b3;

		Bike1 b4 = new Bike1();
		b4.setBrand("Bajaj");
		b4.setModel("Pulsar");
		bikes[3] = b4;

		Bike1 b5 = new Bike1();
		b5.setBrand("TVS");
		b5.setModel("Apache");
		bikes[4] = b5;

		for (int i = 0; i < bikes.length; i++) {
			Bike1 b = bikes[i];
			System.out.println("Brand: " + b.getBrand());
			System.out.println("Model: " + b.getModel());
		}
	}
}