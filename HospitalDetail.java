class HospitalDetail {


	static byte[] ratings = {9, 8, 10};                        
	static short[] deptDoctors = {45, 30, 60};                
	static int[] totalPatients = {15000, 17000, 12000};       
	static long[] hospitalIDs = {1000123456L, 1000987654L};   

	static float[] bodyTemperatures = {98.6f, 99.4f, 100.2f}; 
	static double[] annualIncome = {5000000.75, 6500000.50};  

	static char[] bloodGroups = {'A', 'B', 'O', };        
	static boolean[] emergencyAvailable = {true, false, true}; 

	public static void printRatings() {
		System.out.println("Hospital Ratings (byte):");
		for (int i=0;i<ratings.length;i++) {
			System.out.println(ratings);
		}
	}

	public static void printDepartmentDoctors() {
		System.out.println("Doctors in Departments (short):");
		for (int i=0;i<deptDoctors.length;i++) {
			System.out.println(deptDoctors);
		}
	}

	public static void printTotalPatients() {
		System.out.println("Total Patients (int):");
		for (int patients : totalPatients) {
			System.out.println(patients);
		}
	}

	public static void printHospitalIDs() {
		System.out.println("Hospital IDs (long):");
		for (long id : hospitalIDs) {
			System.out.println(id);
		}
	}

	public static void printBodyTemperatures() {
		System.out.println("Patient Body Temperatures (float):");
		for (float temp : bodyTemperatures) {
			System.out.println(temp);
		}
	}

	public static void printAnnualIncome() {
		System.out.println("Annual Income (double):");
		for (double income : annualIncome) {
			System.out.println(income);
		}
	}

	public static void printBloodGroups() {
		System.out.println("Blood Groups (char):");
		for (char group : bloodGroups) {
			System.out.println(group);
		}
	}

	public static void printEmergencyStatus() {
		System.out.println("Emergency Room Available (boolean):");
		for (boolean status : emergencyAvailable) {
			System.out.println(status);
		}
	}

	public static void main(String[] args) {
		printRatings();
		printDepartmentDoctors();
		printTotalPatients();
		printHospitalIDs();
		printBodyTemperatures();
		printAnnualIncome();
		printBloodGroups();
		printEmergencyStatus();
	}
}
