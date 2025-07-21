class GymsRunner {
	static {
		System.out.println("Static block in GymsRunner");
	}

	public static void main(String[] args) {
		Gyms g1 = new Gyms();
		g1.setName("Cult Fit");
		System.out.println(g1.getName());
		g1.location = "BTM";
		System.out.println(g1.location);
		g1.equipmentCount = 30;
		System.out.println(g1.equipmentCount);
		g1.rating = 4.6f;
		System.out.println(g1.rating);
		System.out.println(Gyms.type);
		System.out.println(g1.type);

		Gyms g2 = new Gyms();
		g2.setName("Gold’s Gym");
		System.out.println(g2.getName());
		g2.location = "Koramangala";
		System.out.println(g2.location);
		g2.equipmentCount = 40;
		System.out.println(g2.equipmentCount);
		g2.rating = 4.7f;
		System.out.println(g2.rating);
		System.out.println(Gyms.type);
		System.out.println(g2.type);

		Gyms g3 = new Gyms();
		g3.setName("Fitness First");
		System.out.println(g3.getName());
		g3.location = "Indiranagar";
		System.out.println(g3.location);
		g3.equipmentCount = 25;
		System.out.println(g3.equipmentCount);
		g3.rating = 4.5f;
		System.out.println(g3.rating);
		System.out.println(Gyms.type);
		System.out.println(g3.type);

		Gyms g4 = new Gyms();
		g4.setName("Snap Fitness");
		System.out.println(g4.getName());
		g4.location = "HSR Layout";
		System.out.println(g4.location);
		g4.equipmentCount = 28;
		System.out.println(g4.equipmentCount);
		g4.rating = 4.3f;
		System.out.println(g4.rating);
		System.out.println(Gyms.type);
		System.out.println(g4.type);

		Gyms g5 = new Gyms();
		g5.setName("Anytime Fitness");
		System.out.println(g5.getName());
		g5.location = "Jayanagar";
		System.out.println(g5.location);
		g5.equipmentCount = 22;
		System.out.println(g5.equipmentCount);
		g5.rating = 4.4f;
		System.out.println(g5.rating);
		System.out.println(Gyms.type);
		System.out.println(g5.type);

		Gyms g6 = new Gyms();
		g6.setName("Body Zone");
		System.out.println(g6.getName());
		g6.location = "Whitefield";
		System.out.println(g6.location);
		g6.equipmentCount = 35;
		System.out.println(g6.equipmentCount);
		g6.rating = 4.6f;
		System.out.println(g6.rating);
		System.out.println(Gyms.type);
		System.out.println(g6.type);

		Gyms g7 = new Gyms();
		g7.setName("FitX");
		System.out.println(g7.getName());
		g7.location = "Electronic City";
		System.out.println(g7.location);
		g7.equipmentCount = 30;
		System.out.println(g7.equipmentCount);
		g7.rating = 4.2f;
		System.out.println(g7.rating);
		System.out.println(Gyms.type);
		System.out.println(g7.type);

		Gyms g8 = new Gyms();
		g8.setName("Muscle Mania");
		System.out.println(g8.getName());
		g8.location = "Banashankari";
		System.out.println(g8.location);
		g8.equipmentCount = 27;
		System.out.println(g8.equipmentCount);
		g8.rating = 4.0f;
		System.out.println(g8.rating);
		System.out.println(Gyms.type);
		System.out.println(g8.type);

		Gyms g9 = new Gyms();
		g9.setName("Alpha Gym");
		System.out.println(g9.getName());
		g9.location = "Yelahanka";
		System.out.println(g9.location);
		g9.equipmentCount = 24;
		System.out.println(g9.equipmentCount);
		g9.rating = 4.1f;
		System.out.println(g9.rating);
		System.out.println(Gyms.type);
		System.out.println(g9.type);
	}
}