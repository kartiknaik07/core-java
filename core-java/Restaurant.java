class Restaurant {
    static int burgerPrice = 120;
    static int pizzaPrice = 250;
    static int friesPrice = 80;
    static int drinksPrice = 50;
    static int dessertPrice = 100;

    public static void main(String[] args) {
      
    }
    public static int priceBurgerPizza() {
        return burgerPrice + pizzaPrice;
    }
    public static int totalBill() {
        return burgerPrice + pizzaPrice + friesPrice + drinksPrice + dessertPrice;
    }
    public static double applyDiscount(int totalAmount, int discountPercent) {
		
        return totalAmount - (totalAmount * discountPercent / 100.0);
    }
    public static double splitBill(int totalAmount, int people) {
        return totalAmount / people;
    }
    public static int addServiceCharge(int totalAmount, int charge) {
        return totalAmount + charge;
    }
}
