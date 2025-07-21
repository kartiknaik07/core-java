class RestaurantsRunner{
	static {
		System.out.println("Static block in Restaurant runner");
	}
	
	public static void main(String[] args){
		Restaurants r = new Restaurants();
		
		r.setName("Al-Daaz");
		System.out.println(r.getName());
		
		r.location = "BTM";
		System.out.println(r.location);
		
		r.seatingCapacity = 50;
		System.out.println(r.seatingCapacity);
		
		r.rating = 4.5f;
		System.out.println(r.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r.category);
		
		
		Restaurants r1 = new Restaurants();
		
		r1.setName("olive");
		System.out.println(r1.getName());
		
		r1.location = "BTM 2nd stage";
		System.out.println(r1.location);
		
		r1.seatingCapacity = 100;
		System.out.println(r1.seatingCapacity);
		
		r1.rating = 4.3f;
		System.out.println(r1.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r1.category);
		
		
		Restaurants r2 = new Restaurants();
		
		r2.setName("A1");
		System.out.println(r2.getName());
		
		r2.location = "Mangaluru";
		System.out.println(r2.location);
		
		r2.seatingCapacity = 58;
		System.out.println(r2.seatingCapacity);
		
		r2.rating = 4.4f;
		System.out.println(r2.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r2.category);
		
		
		Restaurants r3 = new Restaurants();
		
		r3.setName("Paradise");
		System.out.println(r.getName());
		
		r3.location = "Koramangala";
		System.out.println(r3.location);
		
		r3.seatingCapacity = 60;
		System.out.println(r3.seatingCapacity);
		
		r3.rating = 4.6f;
		System.out.println(r3.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r3.category);
		
		
		Restaurants r4 = new Restaurants();
		
		r4.setName("star");
		System.out.println(r4.getName());
		
		r4.location = "BTM 1st stage";
		System.out.println(r4.location);
		
		r4.seatingCapacity = 98;
		System.out.println(r4.seatingCapacity);
		
		r4.rating = 4.5f;
		System.out.println(r4.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r4.category);
		
		
		Restaurants r5 = new Restaurants();
		
		r5.setName("5 star");
		System.out.println(r5.getName());
		
		r5.location = "hsr";
		System.out.println(r5.location);
		
		r5.seatingCapacity = 60;
		System.out.println(r5.seatingCapacity);
		
		r5.rating = 4.2f;
		System.out.println(r5.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r5.category);
		
		
		Restaurants r6 = new Restaurants();
		
		r6.setName("Moon light");
		System.out.println(r6.getName());
		
		r6.location = "Karwar";
		System.out.println(r6.location);
		
		r6.seatingCapacity = 97;
		System.out.println(r6.seatingCapacity);
		
		r6.rating = 4.2f;
		System.out.println(r6.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r6.category);
		
		
		Restaurants r7 = new Restaurants();
		
		r7.setName("Soorya");
		System.out.println(r7.getName());
		
		r7.location = "BTM 1st stage";
		System.out.println(r7.location);
		
		r7.seatingCapacity = 20;
		System.out.println(r7.seatingCapacity);
		
		r7.rating = 4.3f;
		System.out.println(r7.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r7.category);
		
		
		Restaurants r8 = new Restaurants();
		
		r8.setName("Fishland");
		System.out.println(r8.getName());
		
		r8.location = "majestic";
		System.out.println(r8.location);
		
		r8.seatingCapacity = 60;
		System.out.println(r8.seatingCapacity);
		
		r8.rating = 4.1f;
		System.out.println(r8.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r8.category);
		
		
		Restaurants r9 = new Restaurants();
		
		r9.setName("HotSpot");
		System.out.println(r9.getName());
		
		r9.location = "electronic city";
		System.out.println(r9.location);
		
		r9.seatingCapacity = 40;
		System.out.println(r9.seatingCapacity);
		
		r9.rating = 4.1f;
		System.out.println(r9.rating);
		
		System.out.println(Restaurants.category);
		
		System.out.println(r9.category);
		
		
		
	}
}