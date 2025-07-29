class HospitalDetails{
	
	static int[] numberOfPatientWards = {10,20,30,40,50};
	static int[] numberofBedCounts = {2,5,6,7};
	static String[] doctorNames = {"Shreyas","Charan","Anup","Vinyas"};
	
	public static String[] getDoctorNames(){
		for(int j=0;j<doctorNames.length;j++){
			System.out.println(doctorNames[j]);
		}
		return doctorNames;
	}
	public static int[] getNumberofBed(){
		for(int j=0;j<numberofBedCounts.length;j++){
			System.out.println(numberofBedCounts[j]);
		}
		return numberofBedCounts;
	}
	public static int[] getOfPatientWards(){
		for(int j=0;j<numberOfPatientWards.length;j++){
			System.out.println(numberOfPatientWards[j]);
		}
		return numberOfPatientWards;
	}
}