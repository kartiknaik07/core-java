class ActorRunner {
	public static void main(String[] args) {
		Actor[] actors = new Actor[5];

		Actor a1 = new Actor();
		a1.setName("Yash");
		a1.setIndustry("Kannada");

		Actor a2 = new Actor();
		a2.setName("Shah Rukh Khan");
		a2.setIndustry("Bollywood");

		Actor a3 = new Actor();
		a3.setName("Allu Arjun");
		a3.setIndustry("Telugu");

		Actor a4 = new Actor();
		a4.setName("Suriya");
		a4.setIndustry("Tamil");

		Actor a5 = new Actor();
		a5.setName("Mammootty");
		a5.setIndustry("Malayalam");

		for(int i = 0; i < actors.length; i++) {
			if(i == 0) actors[i] = a1;
			else if(i == 1) actors[i] = a2;
			else if(i == 2) actors[i] = a3;
			else if(i == 3) actors[i] = a4;
			else if(i == 4) actors[i] = a5;
		}

		for(int i = 0; i < actors.length; i++) {
			System.out.println("Name: " + actors[i].getName());
			System.out.println("Industry: " + actors[i].getIndustry());
		}
	}
}