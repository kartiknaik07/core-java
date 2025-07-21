class Schools{
	private String name;
	private String address;
	private int numStudents;
	private int classRooms;
	private char schoolGrade;
	static int numTeachers;
	static String principalName;
	
	public static void main(String[] args){
		
	}
	
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String b){
		address = b;
	}
	public String getAddress(){
		return address;
	}
	public void setStudents(int c){
		numStudents = c;
	}
	public int getStudents(){
		return numStudents;
	}
	public void setClassrooms(int d){
		classRooms = d;
	}
	public int getClassrooms(){
		return classRooms;
	}
	public void setGrade(char e){
		schoolGrade = e;
	}
	public char getGrade(){
		return schoolGrade;
	}
}


	