class Hospiital{
	private String name;
	private int hospitalNumber;
	private String address;
	
	int [] numberOfPatientWards = {10,20,30,40,50};
	int [] numberofBedCounts = {2,5,6,7};
	static String [] doctorNames = {"Nandan","Suhas","Manoj","Shahshank"};
	
	public static String[] getDoctorNames(){
		return doctorNames;
	}
	public void setName(String name){
		this.name = name;
	}
	public String  getName(){
		return name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return  address;
	}
}