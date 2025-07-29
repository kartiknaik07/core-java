class VehicleInfo {

	static byte[] fuelEfficiency = {15, 20, 18};
	static short[] tyreCount = {4, 6, 2};
	static int[] mileage = {50000, 70000, 30000};
	static long[] chassisNumbers = {123456789012L, 987654321098L};

	static float[] engineCapacity = {1.2f, 1.5f, 0.9f};
	static double[] insuranceAmount = {15000.75, 20000.50};

	static char[] type = {'C', 'T', 'B'}; // Car, Truck, Bike
	static boolean[] isInsured = {true, false, true};

	public static void printFuelEfficiency() {
		for (int i = 0; i < fuelEfficiency.length; i++) {
			System.out.println(fuelEfficiency[i]);
		}
	}

	public static void printTyreCount() {
		for (int i = 0; i < tyreCount.length; i++) {
			System.out.println(tyreCount[i]);
		}
	}

	public static void printMileage() {
		for (int i = 0; i < mileage.length; i++) {
			System.out.println(mileage[i]);
		}
	}

	public static void printChassisNumbers() {
		for (int i = 0; i < chassisNumbers.length; i++) {
			System.out.println(chassisNumbers[i]);
		}
	}

	public static void printEngineCapacity() {
		for (int i = 0; i < engineCapacity.length; i++) {
			System.out.println(engineCapacity[i]);
		}
	}

	public static void printInsurance() {
		for (int i = 0; i < insuranceAmount.length; i++) {
			System.out.println(insuranceAmount[i]);
		}
	}

	public static void printType() {
		for (int i = 0; i < type.length; i++) {
			System.out.println(type[i]);
		}
	}

	public static void printInsuranceStatus() {
		for (int i = 0; i < isInsured.length; i++) {
			System.out.println(isInsured[i]);
		}
	}

	public static void main(String[] args) {
		printFuelEfficiency();
		printTyreCount();
		printMileage();
		printChassisNumbers();
		printEngineCapacity();
		printInsurance();
		printType();
		printInsuranceStatus();
	}
}
