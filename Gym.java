class Gym {
    static int totalMembers = 150;
    static int monthlyFeePerMember = 2000;
    static int trainerFee = 1000;
    static int equipmentMaintenanceCost = 20000;
    static int electricityBill = 5000;

    public static void main(String[] args) {
        
    }

    public static int monthlyIncome() {
        return totalMembers * monthlyFeePerMember;
    }

    public static int trainerIncome() {
        return totalMembers * trainerFee;
    }

    public static int totalExpenses() {
        return equipmentMaintenanceCost + electricityBill;
    }

    public static int monthlyProfit() {
        return (monthlyIncome() + trainerIncome()) - totalExpenses();
    }

    public static double avgIncomePerMember() {
        return (monthlyIncome() + trainerIncome()) /  totalMembers;
    }
}
