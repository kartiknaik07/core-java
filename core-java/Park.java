class Park {
    static int entryFeePerPerson = 50;
    static int totalVisitors = 300;
    static int parkingFeePerVehicle = 20;
    static int totalVehicles = 80;
    static int maintenanceCost = 7000;

    public static void main(String[] args) {
        
    }

    public static int totalEntryFee() {
        return entryFeePerPerson * totalVisitors;
    }

    public static int totalParkingFee() {
        return parkingFeePerVehicle * totalVehicles;
    }

    public static int totalIncome() {
        return totalEntryFee() + totalParkingFee();
    }

    public static int dailyProfit() {
        return totalIncome() - maintenanceCost;
    }

    public static double avgIncomePerVisitor() {
        return totalIncome() /  totalVisitors;
    }
}
