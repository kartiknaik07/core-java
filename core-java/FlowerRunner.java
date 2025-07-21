class FlowerRunner{
	public static void main(String[] args){
		Flower f = new Flower("Rose","Pink");
		System.out.println("Name:" + f.getName());
		System.out.println("Colour:" + f.getColour());
		System.out.println("==================");
		f.setName("Lotus");
		System.out.println("Name:" + f.getName());
		f.setColour("Light Pink");
		System.out.println("Colour:" + f.getColour());
		
	}
}