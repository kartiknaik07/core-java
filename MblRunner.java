class MblRunner {
	public static void main(String[] args) {
		Mbl m = new Mbl("Samsung", "Galaxy A52");
		System.out.println("Brand: " + m.getBrand());
		System.out.println("Model: " + m.getModel());
		System.out.println("==================");
		m.setBrand("Apple");
		System.out.println("Brand: " + m.getBrand());
		m.setModel("iPhone 15");
		System.out.println("Model: " + m.getModel());
	}
}
