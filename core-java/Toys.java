class Toys{
	static int priceOftoys = 250;
	
	
	public static void main(String[] args){
		
		int totalPrice = getpriceoftoys(5);
		System.out.println("Total Price:" + totalPrice);
		
	}
	public static int getpriceoftoys(int numOftoys){
		int totalPrice = priceOftoys * numOftoys;
		return totalPrice;
	}
}