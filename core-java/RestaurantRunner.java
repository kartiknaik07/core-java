class RestaurantRunner {
    public static void main(String[] args) {
        System.out.println("Total of 1 burger and 1 pizza: " + Restaurant.priceBurgerPizza());
        System.out.println("Total bill: " + Restaurant.totalBill());
        System.out.println("Discounted bill (10% off): " + Restaurant.applyDiscount(Restaurant.totalBill(), 10));
        System.out.println("Split bill among 3 people: " + Restaurant.splitBill(Restaurant.totalBill(), 3));
        System.out.println("Add extra charges (service fee 50): " + Restaurant.addServiceCharge(Restaurant.totalBill(), 50));
    }
}
