class Cinema {
    static int ticketPrice = 200;
    static int totalSeats = 150;
    static int snacksRevenuePerPerson = 50;
    static int electricityCost = 5000;
    static int staffCost = 8000;

    public static void main(String[] args) {
       
    }

    public static int totalTicketRevenue(int ticketsSold) {
        return ticketPrice * ticketsSold;
    }

    public static int totalSnacksRevenue(int ticketsSold) {
        return snacksRevenuePerPerson * ticketsSold;
    }

    public static int totalIncome(int ticketsSold) {
        return totalTicketRevenue(ticketsSold) + totalSnacksRevenue(ticketsSold);
    }

    public static int totalExpenses() {
        return electricityCost + staffCost;
    }

    public static int netProfit(int ticketsSold) {
        return totalIncome(ticketsSold) - totalExpenses();
    }
}
