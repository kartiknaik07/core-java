class BagRunner{
	public static void main(String[] args){
		Bag[] bags = new Bag[5];
		
		Bag bag = new Bag();
		bag.setType("Trekking Bag");
		bag.setColour("Grey");
		
		bags[0] = bag;
		
		Bag bag1 = new Bag();
		bag1.setType("Office Bag");
		bag1.setColour("Brown");
		
		bags[1] = bag1;
		
		Bag bag2 = new Bag();
		bag2.setType("School Bag");
		bag2.setColour("Blue");
		
		bags[2] = bag2;
		
		Bag bag3 = new Bag();
		bag3.setType("Tiffin Bag");
		bag3.setColour("Voilet");
		
		bags[3] = bag3;
		
		Bag bag4 = new Bag();
		bag4.setType("Carry Bag");
		bag4.setColour("Orange");
		
		bags[4] = bag4;
		
		for(int i = 0; i < bags.length; i++){
			Bag b = bags[i];
			System.out.println("Bag Type:" + b.getType());
			System.out.println("Bag Colour:" + b.getColour());	
		}	
	}
}