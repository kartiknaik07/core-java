class Aadhar{
	private int id;
	private String name;
	private String address;
	private long phoneNo;
	private  int age;
	
	public Aadhar(){
		
	}
	public Aadhar(int id, String name){
		this.id = id;
		this.name = name;
	}
	public Aadhar(int id, String name, String address){
		this(id,name);
		this.address = address;
	}
	public Aadhar(int id, String name, String address, long phoneNo){
		this(id,name,address);
		this.phoneNo = phoneNo;
	}
	public Aadhar(int id, String name, String address, long phoneNo, int age){
		this(id,name,address,phoneNo);
		this.age = age;
	}
	
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public long getPhoneNo(){
		return phoneNo;
	}
	public int getAge(){
		return age;
	}
}
	