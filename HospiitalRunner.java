class HospiitalRunner{
	public static void main(String[] args){
		//int[] numbers = new int[10];
		//String [] names = new String[5];
		Hospiital[] hospitals = new Hospiital[2];
		
		Hospiital hospital  = new Hospiital();
		hospital.setName("Jayadeva Hospital");
		hospital.setAddress("Micro Layout");
		//System.out.println(hospital.getAddress());
		
		hospitals[0] = hospital;
		
		Hospiital hospital1 = new Hospiital();
		hospital1.setName("Nimhans");
		hospital1.setAddress("RR Nagara ");
		
		hospitals[1] = hospital1;
		
		for(int i=0;i<hospitals.length;i++){
			//System.out.println("Hospital ============= "+(i+1));
			Hospiital localHospital = hospitals[i];
			System.out.println(localHospital.getName());
			System.out.println(localHospital.getAddress());
		}
	}
}