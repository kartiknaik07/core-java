class CeoRunner{
	public static void main(String[] args){
		
		Ceo ceo = new Ceo("Shreyas",100000.00f,"Bengaluru");
		System.out.println(ceo.getName());
		System.out.println(ceo.getSalary());
		System.out.println(ceo.getCity());
	}
}