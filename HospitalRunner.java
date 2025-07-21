class HospitalRunner{
	public static void main(String[] args){
		Hospital h = new Hospital();
		h.setName("Appolo");
		System.out.println(h.getName());
		
		h.setLocation("Bengaluru");
		System.out.println(h.getLocation());
		
		h.setBeds(100);
		System.out.println(h.getBeds());
	}
}
		