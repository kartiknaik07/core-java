class School {
	String name;
	String address;
	int numStudents;
	int numTeachers;
	String principalName;
	
	
	
	public static void main(String[] args){
		School school = new School();
		
		school.name = "Shanthiniketan";
		System.out.println(school.name);
		school.address = "Bengaluru";
		System.out.println(school.address);
		school.numStudents = 20;
		System.out.println(school.numStudents);
		school.numTeachers = 5;
		System.out.println(school.numTeachers);
		school.principalName = "Anup";
		System.out.println(school.principalName);
	    
		
		School school1 = new School();
		
		school1.name = "Sacred Heart";
		System.out.println(school1.name);
		school1.address = "Karwar";
		System.out.println(school1.address);
		school1.numStudents = 25;
		System.out.println(school1.numStudents);
		school1.numTeachers = 6;
		System.out.println(school1.numTeachers);
		school1.principalName = "Anup";
		System.out.println(school.principalName);
		
		School school2 = new School();
		
		school2.name = "st Joseph";
		System.out.println(school2.name);
		school2.address = "Mangaluru"; 
		System.out.println(school2.address);
		
		School school3 = new School();
		
		school3.name = "Milagris";
		System.out.println(school3.name);
		school3.address = "Udupi"; 
		System.out.println(school3.address);
		
		School school4 = new School();
		
		school4.name = "KPS";
		System.out.println(school4.name);
		school4.address = "Ankola"; 
		System.out.println(school4.address);
		
		School school5 = new School();
		
		school5.name = "st aloysious";
		System.out.println(school5.name);
		school5.address = "Mysore"; 
		System.out.println(school5.address);
		
		School school6 = new School();
		
		school6.name = "jss";
		System.out.println(school6.name);
		school6.address = "Dharwad"; 
		System.out.println(school6.address);
		
		School school7 = new School();
		
		school7.name = "jc";
		System.out.println(school7.name);
		school7.address = "Hubli"; 
		System.out.println(school7.address);
		
		School school8 = new School();
		
		school8.name = "gs";
		System.out.println(school8.name);
		school8.address = "Hassan"; 
		System.out.println(school8.address);
		
		School school9 = new School();
		
		school9.name = "Himalayan";
		System.out.println(school9.name);
		school9.address = "Kolar"; 
		System.out.println(school9.address);
		
		school.setSchool("DAIS","Mumbai",100,20,"Shreyas");
		System.out.println(school.name);
		System.out.println(school.address);
		System.out.println(school.numStudents);
		System.out.println(school.numTeachers);
		System.out.println(school.principalName);
		
	}
	public void setSchool(String nos, String aos, int numos, int numot, String pName){
		name = nos;
		address = aos;
		numStudents = numos;
		numTeachers = numot;
		principalName = pName;
	}
}