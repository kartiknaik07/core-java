class MovieDetail {

	static byte[] ratings = {8, 9, 7};
	static short[] totalCrew = {150, 120, 200};
	static int[] totalViewers = {100000, 150000, 120000};
	static long[] movieIDs = {9876543210L, 1234567890L};

	static float[] avgWatchHours = {2.5f, 3.0f, 1.8f};
	static double[] boxOffice = {15000000.75, 20000000.50};

	static char[] certificate = {'U', 'A', 'U'};
	static boolean[] isSequel = {false, true, false};

	public static void printRatings() {
		for (int i = 0; i < ratings.length; i++) {
			System.out.println(ratings[i]);
		}
	}

	public static void printCrew() {
		for (int i = 0; i < totalCrew.length; i++) {
			System.out.println(totalCrew[i]);
		}
	}

	public static void printViewers() {
		for (int i = 0; i < totalViewers.length; i++) {
			System.out.println(totalViewers[i]);
		}
	}

	public static void printIDs() {
		for (int i = 0; i < movieIDs.length; i++) {
			System.out.println(movieIDs[i]);
		}
	}

	public static void printWatchHours() {
		for (int i = 0; i < avgWatchHours.length; i++) {
			System.out.println(avgWatchHours[i]);
		}
	}

	public static void printBoxOffice() {
		for (int i = 0; i < boxOffice.length; i++) {
			System.out.println(boxOffice[i]);
		}
	}

	public static void printCertificate() {
		for (int i = 0; i < certificate.length; i++) {
			System.out.println(certificate[i]);
		}
	}

	public static void printSequelStatus() {
		for (int i = 0; i < isSequel.length; i++) {
			System.out.println(isSequel[i]);
		}
	}

	public static void main(String[] args) {
		printRatings();
		printCrew();
		printViewers();
		printIDs();
		printWatchHours();
		printBoxOffice();
		printCertificate();
		printSequelStatus();
	}
}
