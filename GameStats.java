class GameStats {

	static byte[] gameRatings = {8, 9, 10};
	static short[] onlinePlayers = {300, 450, 600};
	static int[] totalDownloads = {100000, 250000, 500000};
	static long[] gameIDs = {9876543210L, 8765432109L};

	static float[] avgFrameRates = {60.5f, 55.3f, 75.2f};
	static double[] revenue = {1000000.50, 1250000.75};

	static char[] difficultyLevels = {'E', 'M', 'H'};
	static boolean[] multiplayerEnabled = {true, true, false};

	public static void printGameRatings() {
		for (int i = 0; i < gameRatings.length; i++) {
			System.out.println(gameRatings[i]);
		}
	}

	public static void printOnlinePlayers() {
		for (int i = 0; i < onlinePlayers.length; i++) {
			System.out.println(onlinePlayers[i]);
		}
	}

	public static void printDownloads() {
		for (int i = 0; i < totalDownloads.length; i++) {
			System.out.println(totalDownloads[i]);
		}
	}

	public static void printGameIDs() {
		for (int i = 0; i < gameIDs.length; i++) {
			System.out.println(gameIDs[i]);
		}
	}

	public static void printFrameRates() {
		for (int i = 0; i < avgFrameRates.length; i++) {
			System.out.println(avgFrameRates[i]);
		}
	}

	public static void printRevenue() {
		for (int i = 0; i < revenue.length; i++) {
			System.out.println(revenue[i]);
		}
	}

	public static void printDifficultyLevels() {
		for (int i = 0; i < difficultyLevels.length; i++) {
			System.out.println(difficultyLevels[i]);
		}
	}

	public static void printMultiplayerStatus() {
		for (int i = 0; i < multiplayerEnabled.length; i++) {
			System.out.println(multiplayerEnabled[i]);
		}
	}

	public static void main(String[] args) {
		printGameRatings();
		printOnlinePlayers();
		printDownloads();
		printGameIDs();
		printFrameRates();
		printRevenue();
		printDifficultyLevels();
		printMultiplayerStatus();
	}
}
