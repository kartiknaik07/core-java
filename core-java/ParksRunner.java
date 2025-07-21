class ParksRunner {
	static {
		System.out.println("Static block in ParksRunner");
	}

	public static void main(String[] args) {
		Parks p1 = new Parks();
		p1.setName("Lalbagh");
		System.out.println(p1.getName());
		p1.location = "Jayanagar";
		System.out.println(p1.location);
		p1.areaInAcres = 240;
		System.out.println(p1.areaInAcres);
		p1.entryFee = 20.0f;
		System.out.println(p1.entryFee);
		System.out.println(Parks.category);
		System.out.println(p1.category);

		Parks p2 = new Parks();
		p2.setName("Cubbon Park");
		System.out.println(p2.getName());
		p2.location = "MG Road";
		System.out.println(p2.location);
		p2.areaInAcres = 300;
		System.out.println(p2.areaInAcres);
		p2.entryFee = 0.0f;
		System.out.println(p2.entryFee);
		System.out.println(Parks.category);
		System.out.println(p2.category);

		Parks p3 = new Parks();
		p3.setName("JP Park");
		System.out.println(p3.getName());
		p3.location = "Mathikere";
		System.out.println(p3.location);
		p3.areaInAcres = 85;
		System.out.println(p3.areaInAcres);
		p3.entryFee = 10.0f;
		System.out.println(p3.entryFee);
		System.out.println(Parks.category);
		System.out.println(p3.category);

		Parks p4 = new Parks();
		p4.setName("Bannerghatta Park");
		System.out.println(p4.getName());
		p4.location = "Bannerghatta Road";
		System.out.println(p4.location);
		p4.areaInAcres = 100;
		System.out.println(p4.areaInAcres);
		p4.entryFee = 80.0f;
		System.out.println(p4.entryFee);
		System.out.println(Parks.category);
		System.out.println(p4.category);

		Parks p5 = new Parks();
		p5.setName("Bugle Rock Park");
		System.out.println(p5.getName());
		p5.location = "Basavanagudi";
		System.out.println(p5.location);
		p5.areaInAcres = 16;
		System.out.println(p5.areaInAcres);
		p5.entryFee = 0.0f;
		System.out.println(p5.entryFee);
		System.out.println(Parks.category);
		System.out.println(p5.category);

		Parks p6 = new Parks();
		p6.setName("Freedom Park");
		System.out.println(p6.getName());
		p6.location = "Gandhi Nagar";
		System.out.println(p6.location);
		p6.areaInAcres = 21;
		System.out.println(p6.areaInAcres);
		p6.entryFee = 0.0f;
		System.out.println(p6.entryFee);
		System.out.println(Parks.category);
		System.out.println(p6.category);

		Parks p7 = new Parks();
		p7.setName("Hebbal Lake Park");
		System.out.println(p7.getName());
		p7.location = "Hebbal";
		System.out.println(p7.location);
		p7.areaInAcres = 40;
		System.out.println(p7.areaInAcres);
		p7.entryFee = 10.0f;
		System.out.println(p7.entryFee);
		System.out.println(Parks.category);
		System.out.println(p7.category);

		Parks p8 = new Parks();
		p8.setName("Sankey Tank Park");
		System.out.println(p8.getName());
		p8.location = "Sadashivanagar";
		System.out.println(p8.location);
		p8.areaInAcres = 30;
		System.out.println(p8.areaInAcres);
		p8.entryFee = 5.0f;
		System.out.println(p8.entryFee);
		System.out.println(Parks.category);
		System.out.println(p8.category);

		Parks p9 = new Parks();
		p9.setName("M N Krishna Rao Park");
		System.out.println(p9.getName());
		p9.location = "Basavanagudi";
		System.out.println(p9.location);
		p9.areaInAcres = 20;
		System.out.println(p9.areaInAcres);
		p9.entryFee = 0.0f;
		System.out.println(p9.entryFee);
		System.out.println(Parks.category);
		System.out.println(p9.category);
	}
}