class ChocolateRunner{
	public static void main(String[] args){
		Chocolate[] choco = new Chocolate[5];
		
		Chocolate ch = new Chocolate();
		ch.setName("Dairy Milk");
		ch.setCompany("Cadbury");
		
		choco[0] = ch;
		
		Chocolate ch1 = new Chocolate();
		ch1.setName("Milky Bar");
		ch1.setCompany("Nestle");
		
		choco[1] = ch1;
		
		Chocolate ch2 = new Chocolate();
		ch2.setName("Kisses");
		ch2.setCompany("Hersheys");
		
		choco[2] = ch2;
		
		Chocolate ch3 = new Chocolate();
		ch3.setName("Dark Chocolate");
		ch3.setCompany("Amul");
		
		choco[3] = ch3;
		
		Chocolate ch4 = new Chocolate();
		ch4.setName("Smooth Milk");
		ch4.setCompany("Galaxy");
		
		choco[4] = ch4;
		
		for(int i = 0; i < choco.length; i++){
			Chocolate c = choco[i];
			System.out.println("Company:" + c.getCompany());
			System.out.println("Name:" + c.getName());
		}
	}
}