class CompanyCeoRunner{
	public static void main(String[] args){
		
		Company company = new Company("Infosys",123456,"Bengaluru",2000);
	    System.out.println("Printing company details");
		System.out.println(company.getName());
		System.out.println(company.getCity());
		
		Ceo ceo = new Ceo("Shreyas",100000.00f,"Bengaluru");
		company.setCeo(ceo);
		
		Ceo ceo1 = company.getCeo();
		System.out.println("Printing company's ceo details");
		System.out.println(ceo.getName());
		System.out.println(ceo.getSalary());
		System.out.println(ceo.getCity());
	}
}