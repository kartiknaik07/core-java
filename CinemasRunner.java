class CinemasRunner {
	static {
		System.out.println("Static block in CinemasRunner");
	}

	public static void main(String[] args) {
		Cinemas c1 = new Cinemas();
		c1.setName("PVR Orion");
		System.out.println(c1.getName());
		c1.location = "Rajajinagar";
		System.out.println(c1.location);
		c1.totalScreens = 5;
		System.out.println(c1.totalScreens);
		c1.ticketPrice = 280.0f;
		System.out.println(c1.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c1.type);

		Cinemas c2 = new Cinemas();
		c2.setName("INOX Garuda");
		System.out.println(c2.getName());
		c2.location = "Magestic";
		System.out.println(c2.location);
		c2.totalScreens = 4;
		System.out.println(c2.totalScreens);
		c2.ticketPrice = 240.0f;
		System.out.println(c2.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c2.type);

		Cinemas c3 = new Cinemas();
		c3.setName("Cinepolis");
		System.out.println(c3.getName());
		c3.location = "Bannerghatta Road";
		System.out.println(c3.location);
		c3.totalScreens = 6;
		System.out.println(c3.totalScreens);
		c3.ticketPrice = 320.0f;
		System.out.println(c3.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c3.type);

		Cinemas c4 = new Cinemas();
		c4.setName("Rex Theatre");
		System.out.println(c4.getName());
		c4.location = "Brigade Road";
		System.out.println(c4.location);
		c4.totalScreens = 2;
		System.out.println(c4.totalScreens);
		c4.ticketPrice = 150.0f;
		System.out.println(c4.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c4.type);

		Cinemas c5 = new Cinemas();
		c5.setName("Sri Balaji");
		System.out.println(c5.getName());
		c5.location = "Jayanagar";
		System.out.println(c5.location);
		c5.totalScreens = 1;
		System.out.println(c5.totalScreens);
		c5.ticketPrice = 120.0f;
		System.out.println(c5.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c5.type);

		Cinemas c6 = new Cinemas();
		c6.setName("Urvashi Cinema");
		System.out.println(c6.getName());
		c6.location = "Lalbagh";
		System.out.println(c6.location);
		c6.totalScreens = 1;
		System.out.println(c6.totalScreens);
		c6.ticketPrice = 160.0f;
		System.out.println(c6.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c6.type);

		Cinemas c7 = new Cinemas();
		c7.setName("Vaibhav Theatre");
		System.out.println(c7.getName());
		c7.location = "RT Nagar";
		System.out.println(c7.location);
		c7.totalScreens = 1;
		System.out.println(c7.totalScreens);
		c7.ticketPrice = 140.0f;
		System.out.println(c7.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c7.type);

		Cinemas c8 = new Cinemas();
		c8.setName("Forum Shantiniketan");
		System.out.println(c8.getName());
		c8.location = "Whitefield";
		System.out.println(c8.location);
		c8.totalScreens = 7;
		System.out.println(c8.totalScreens);
		c8.ticketPrice = 300.0f;
		System.out.println(c8.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c8.type);

		Cinemas c9 = new Cinemas();
		c9.setName("Rockline Mall");
		System.out.println(c9.getName());
		c9.location = "Nagasandra";
		System.out.println(c9.location);
		c9.totalScreens = 5;
		System.out.println(c9.totalScreens);
		c9.ticketPrice = 250.0f;
		System.out.println(c9.ticketPrice);
		System.out.println(Cinemas.type);
		System.out.println(c9.type);
	}
}