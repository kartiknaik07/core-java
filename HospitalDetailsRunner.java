class HospitalDetailsRunner{
	public static void main(String[] args){
		
		String[] doctorNames = HospitalDetails.getDoctorNames();
		System.out.println(doctorNames);
		
		int[] numberOfPatientWards = HospitalDetails.getOfPatientWards();
		System.out.println(numberOfPatientWards);
		
		int[] numberofBedCounts = HospitalDetails.getNumberofBed();
		System.out.println(numberofBedCounts);
		
		
	}
}