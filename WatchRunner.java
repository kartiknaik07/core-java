class WatchRunner{
	public static void main(String[] args){
		Watch[] watches = new Watch[5];
		
		Watch w = new Watch();
		w.setName("Fastrack");
		w.setColour("Black");
		
		
		Watch w1 = new Watch();
		w1.setName("Firebolt");
		w1.setColour("White");
		
		Watch w2 = new Watch();
		w2.setName("Noise");
		w2.setColour("Brown");
		
		Watch w3 = new Watch();
		w3.setName("HMT");
		w3.setColour("Silver");
		
		Watch w4 = new Watch();
		w4.setName("Rolex");
		w4.setColour("Golden");
		
		
		for(int i = 0; i<watches.length; i++){
			if(i==0){
				watches[i] = w;
			}
			else if(i==1){
				watches[i] = w1;
			}
			else if(i==2){
				watches[i] = w2;
			}
			else if(i==3){
				watches[i] = w3;
			}
			else if(i==4){
				watches[i] = w4;
			}
		}
		
		
		for(int i = 0; i<watches.length;i++){
			Watch watch = watches[i];
			if(watch != null){
				
			   System.out.println("Name:" + watch.getName());
			   System.out.println("Colour:" + watch.getColour());
			}
		}
		
	}
}