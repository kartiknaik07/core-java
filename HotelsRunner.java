class HotelsRunner {
	static {
		System.out.println("Static block in HotelsRunner");
	}

	public static void main(String[] args) {
		Hotels h1 = new Hotels();
		h1.setName("Taj");
		System.out.println(h1.getName());
		h1.city = "Mumbai";
		System.out.println(h1.city);
		h1.roomsAvailable = 120;
		System.out.println(h1.roomsAvailable);
		h1.rating = 4.8f;
		System.out.println(h1.rating);
		System.out.println(Hotels.classification);
		System.out.println(h1.classification);

		Hotels h2 = new Hotels();
		h2.setName("The Leela");
		System.out.println(h2.getName());
		h2.city = "Bangalore";
		System.out.println(h2.city);
		h2.roomsAvailable = 90;
		System.out.println(h2.roomsAvailable);
		h2.rating = 4.7f;
		System.out.println(h2.rating);
		System.out.println(Hotels.classification);
		System.out.println(h2.classification);

		Hotels h3 = new Hotels();
		h3.setName("Oberoi");
		System.out.println(h3.getName());
		h3.city = "Delhi";
		System.out.println(h3.city);
		h3.roomsAvailable = 100;
		System.out.println(h3.roomsAvailable);
		h3.rating = 4.6f;
		System.out.println(h3.rating);
		System.out.println(Hotels.classification);
		System.out.println(h3.classification);

		Hotels h4 = new Hotels();
		h4.setName("Radisson");
		System.out.println(h4.getName());
		h4.city = "Chennai";
		System.out.println(h4.city);
		h4.roomsAvailable = 80;
		System.out.println(h4.roomsAvailable);
		h4.rating = 4.5f;
		System.out.println(h4.rating);
		System.out.println(Hotels.classification);
		System.out.println(h4.classification);

		Hotels h5 = new Hotels();
		h5.setName("Hyatt");
		System.out.println(h5.getName());
		h5.city = "Pune";
		System.out.println(h5.city);
		h5.roomsAvailable = 85;
		System.out.println(h5.roomsAvailable);
		h5.rating = 4.4f;
		System.out.println(h5.rating);
		System.out.println(Hotels.classification);
		System.out.println(h5.classification);

		Hotels h6 = new Hotels();
		h6.setName("Novotel");
		System.out.println(h6.getName());
		h6.city = "Hyderabad";
		System.out.println(h6.city);
		h6.roomsAvailable = 95;
		System.out.println(h6.roomsAvailable);
		h6.rating = 4.3f;
		System.out.println(h6.rating);
		System.out.println(Hotels.classification);
		System.out.println(h6.classification);

		Hotels h7 = new Hotels();
		h7.setName("Marriott");
		System.out.println(h7.getName());
		h7.city = "Goa";
		System.out.println(h7.city);
		h7.roomsAvailable = 60;
		System.out.println(h7.roomsAvailable);
		h7.rating = 4.6f;
		System.out.println(h7.rating);
		System.out.println(Hotels.classification);
		System.out.println(h7.classification);

		Hotels h8 = new Hotels();
		h8.setName("Lalit");
		System.out.println(h8.getName());
		h8.city = "Kolkata";
		System.out.println(h8.city);
		h8.roomsAvailable = 110;
		System.out.println(h8.roomsAvailable);
		h8.rating = 4.5f;
		System.out.println(h8.rating);
		System.out.println(Hotels.classification);
		System.out.println(h8.classification);

		Hotels h9 = new Hotels();
		h9.setName("Resort Rio");
		System.out.println(h9.getName());
		h9.city = "Goa";
		System.out.println(h9.city);
		h9.roomsAvailable = 70;
		System.out.println(h9.roomsAvailable);
		h9.rating = 4.2f;
		System.out.println(h9.rating);
		System.out.println(Hotels.classification);
		System.out.println(h9.classification);
	}
}