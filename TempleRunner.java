class TempleRunner{
	public static void main(String[] args){
		Temple[] temples = new Temple[5];
		
		Temple temple1 = new Temple();
		temple1.setName("Iscon");
		temple1.setAddress("Rajajinagar");
		
		//temples[0] = temple1;
		
		Temple temple2 = new Temple();
		temple2.setName("Circle Maramma");
		temple2.setAddress("Malleshwaram");
		
		//temples[1] = templ2;
		
		//insertion
		for(int i=0;i<temples.length;i++){
			if(i==0){
			temples[i] = temple1;
			}else if(i==1){
				temples[i] = temple2;
			}
		}
		for(int i=0;i<temples.length;i++){
			Temple temple = temples[i];
			if(temple != null){
				System.out.println(temple.getName());
				System.out.println(temple.getAddress());
			}
		}
		//if(temples[i] != null){
			//System.out.println("Temples Name:" + temples[i].getName());
			//System.out.println("Temples Address:" + temples[i].getAddress());
		//}
	}
}
				