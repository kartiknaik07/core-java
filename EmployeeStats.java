class EmployeeStats {

	static byte[] experience = {2, 5, 3};
	static short[] teamSize = {10, 12, 15};
	static int[] employeeIDs = {101, 102, 103};
	static long[] contactNumbers = {9876543210L, 8765432109L};

	static float[] workHours = {8.5f, 9.0f, 7.5f};
	static double[] salary = {50000.50, 65000.75};

	static char[] gender = {'M', 'F', 'M'};
	static boolean[] isPermanent = {true, false, true};

	public static void printExperience() {
		for (int i = 0; i < experience.length; i++) {
			System.out.println(experience[i]);
		}
	}

	public static void printTeamSize() {
		for (int i = 0; i < teamSize.length; i++) {
			System.out.println(teamSize[i]);
		}
	}

	public static void printEmployeeIDs() {
		for (int i = 0; i < employeeIDs.length; i++) {
			System.out.println(employeeIDs[i]);
		}
	}

	public static void printContactNumbers() {
		for (int i = 0; i < contactNumbers.length; i++) {
			System.out.println(contactNumbers[i]);
		}
	}

	public static void printWorkHours() {
		for (int i = 0; i < workHours.length; i++) {
			System.out.println(workHours[i]);
		}
	}

	public static void printSalary() {
		for (int i = 0; i < salary.length; i++) {
			System.out.println(salary[i]);
		}
	}

	public static void printGender() {
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
	}

	public static void printPermanentStatus() {
		for (int i = 0; i < isPermanent.length; i++) {
			System.out.println(isPermanent[i]);
		}
	}

	public static void main(String[] args) {
		printExperience();
		printTeamSize();
		printEmployeeIDs();
		printContactNumbers();
		printWorkHours();
		printSalary();
		printGender();
		printPermanentStatus();
	}
}
