class Schoolsrunner{
	public static void main(String[] args){
		
	   Schools s1 = new Schools();
	   s1.setName("Shanthiniketan");
	   System.out.println(s1.getName());
	   
	   s1.setAddress("Bengaluru");
	   System.out.println(s1.getAddress());
	   
	   s1.setStudents(200);
	   System.out.println(s1.getStudents());
	  
	   s1.setClassrooms(10);
	   System.out.println(s1.getClassrooms());
	   
	   s1.setGrade('A');
	   System.out.println(s1.getGrade());
	   
	   Schools s2 = new Schools();
	   
	  
	   s2.setName("st Joseph");
	   System.out.println(s2.getName());
	   
	   s2.setAddress("Mangaluru");
	   System.out.println(s2.getAddress());
	  
	   s2.setStudents(250);
	   System.out.println(s2.getStudents());
	   
	   s2.setClassrooms(12);
	   System.out.println(s2.getClassrooms());
	   
	   s2.setGrade('B');
	   System.out.println(s2.getGrade());
	   
	   Schools s3 = new Schools();
	   
	   s3.setName("st aloysious");
	   System.out.println(s3.getName());
	   
	   Schools s4 = new Schools();
	   
	   s4.setName("st Joseph");
	   System.out.println(s4.getName());
	   
	   Schools s5 = new Schools();
	   
	   s5.setName("Milagris");
	   System.out.println(s5.getName());
	   
	   Schools s6 = new Schools();
	   
	   s6.setName("Sacred Heart");
	   System.out.println(s6.getName());
	   
	   Schools s7 = new Schools();
	   
	   s7.setName("gc");
	   System.out.println(s7.getName());
	   
	   Schools s8 = new Schools();
	   
	   s8.setName("js");
	   System.out.println(s8.getName());
	   
	   Schools s9 = new Schools();
	   
	   s9.setName("DAIS");
	   System.out.println(s9.getName());
	   
    
	
	   Schools.numTeachers = 10;
	   System.out.println(Schools.numTeachers);
	   
	   Schools.principalName = "Anup";
	   System.out.println(Schools.principalName);
	   
	   
 
	   
	   
	   
	}
}