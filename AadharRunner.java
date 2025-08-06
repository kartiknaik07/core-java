class AadharRunner{
	public static void main(String[] args){
		
		Aadhar a = new Aadhar(001,"Shreyas","Udupi",8153325891L,23);
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getAddress());
		System.out.println(a.getPhoneNo());
		System.out.println(a.getAge());
		
		Aadhar a1 = new Aadhar(002,"Anup","Ankola",9564251786L,24);
		System.out.println(a1.getId());
		System.out.println(a1.getName());
		System.out.println(a1.getAddress());
		System.out.println(a1.getPhoneNo());
		System.out.println(a1.getAge());
		
		Aadhar a2 = new Aadhar(003,"Manthan","Bengaluru",9256781248L,25);
		System.out.println(a2.getId());
		System.out.println(a2.getName());
		System.out.println(a2.getAddress());
		System.out.println(a2.getPhoneNo());
		System.out.println(a2.getAge());
		
		Aadhar a4 = new Aadhar(004,"Sanat","Karwar",7458952691L,22);
		System.out.println(a4.getId());
		System.out.println(a4.getName());
		System.out.println(a4.getAddress());
		System.out.println(a4.getPhoneNo());
		System.out.println(a4.getAge());
		
		Aadhar a5 = new Aadhar(005,"Bhavish","Mangaluru",9645281546L,23);
		System.out.println(a5.getId());
		System.out.println(a5.getName());
		System.out.println(a5.getAddress());
		System.out.println(a5.getPhoneNo());
		System.out.println(a5.getAge());
	}
}