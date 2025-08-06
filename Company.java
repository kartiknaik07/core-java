class Company{
	private String name;
	private long id;
	private String city;
	private int numberOfEmployees;
	
	public Company(){
		
	}
	//Constructor overloading - multiple constructor 
	
	public Company(String name,long id){
		//System.out.println("Initilizing name, id");
		this.name = name;
		this.id = id;
	}
	
	public Company(String name, long id, String city){
		//this.name = name;
		//this.id = id;
		this(name,id);
		//System.out.println("initalizing city");
		this.city = city;
	}
	
	public Company(String name, long id, String city, int numberOfEmployees){
		this(name,id,city);
		//System.out.println("initailizing employees");
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public String getName(){
		return name;
	}
	public long getId(){
		return id;
	}
	public String getCity(){
		return city;
	}
	public int getEmployee(){
		return numberOfEmployees;
	}
}
	