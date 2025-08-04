class SeriesRunner{
	public static void main(String[] args){
		Series[] series = new Series[5];
		
		Series s = new Series();
		s.setName("Money Heist");
		s.setLanguage("Spanish");
		
		Series s1 = new Series();
		s1.setName("The Boys");
		s1.setLanguage("English");
		
		Series s2 = new Series();
		s2.setName("Squid Game");
		s2.setLanguage("Spanish");
		
		Series s3 = new Series();
		s3.setName("Family Man");
		s3.setLanguage("Hindi");
		
		Series s4 = new Series();
		s4.setName("Ayyana Mane");
		s4.setLanguage("Kannada");
		
		for(int i = 0; i<series.length; i++){
			if(i==0){
				series[i] = s;
			}
			else if(i==1){
				series[i] = s1;
			}
			else if(i==2){
				series[i] = s2;
			}
			else if(i==3){
				series[i] = s3;
			}
			else if(i==4){
				series[i] = s4;
			}
		}
		
		for(int i=0;i<series.length;i++){
			System.out.println("Name:" + series[i].getName());
			System.out.println("Language:" + series[i].getLanguage());
		}
	}
}
		
		