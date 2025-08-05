class Country1Runner{
	public static void main(String[] args){
		
		Country1 country = new Country1();
		country.setName("India");
		
		State[] states = new State[30];
		
		State state = new State();
		state.setName("Karnataka");
		state.setChiefMinister("Siddaramaih");
		
		states[0] = state;
		
		State state1 = new State();
		state1.setName("Andhra Pradesh");
		state1.setChiefMinister("N.Chandrababu Naidu");
		
		states[1] = state1;
		
		State state2 = new State();
		state2.setName("Arunachal Pradesh");
		state2.setChiefMinister("Pema Khandu");
		
		states[2] = state2;
		
		State state3 = new State();
		state3.setName("Assam");
		state3.setChiefMinister("Himanth Biswa sarma");
		
		states[3] = state3;
		
		State state4 = new State();
		state4.setName("Bihar");
		state4.setChiefMinister("Nithish Kumar");
		
		states[4] = state4;
		
		State state5 = new State();
		state5.setName("Chattisgarh");
		state5.setChiefMinister("Vishnu Deo Sai");
		
		states[5] = state5;
		
		State state6 = new State();
		state6.setName("Dehli");
		state6.setChiefMinister("Rekha Gupta");
		
		states[6] = state6;
		
		State state7 = new State();
		state7.setName("Goa");
		state7.setChiefMinister("Pramod Sawant");
		
		states[7] = state7;
		
		State state8 = new State();
		state8.setName("Gujarat");
		state8.setChiefMinister("Bhupendrabhai Patel");
		
		states[8] = state8;
		
		State state9 = new State();
		state9.setName("Haryana");
		state9.setChiefMinister("Nayab Singh Saini");
		
		states[9] = state9;
		
		State state10 = new State();
		state10.setName("Himachal Pradesh");
		state10.setChiefMinister("Sukhvinder Singh Sukhu");
		
		states[10] = state10;
		
		State state11 = new State();
		state11.setName("Jammu and Kashmir");
		state11.setChiefMinister("Omar Abdullah");
		
		states[11] = state11;
		
		State state12 = new State();
		state12.setName("Jharkhand");
		state12.setChiefMinister("Hemanth Soren");
		
		states[12] = state12;
		
		State state13 = new State();
		state13.setName("Kerala");
		state13.setChiefMinister("Pinarayi Vijayan");
		
		states[13] = state13;
		
		State state14 = new State();
		state14.setName("Madhya Pradesh");
		state14.setChiefMinister("Mohan Yadav");
		
		states[14] = state14;
		
		State state15 = new State();
		state15.setName("Maharashtra");
		state15.setChiefMinister("Devendra Fadnavis");
		
		states[15] = state15;
		
		State state16 = new State();
		state16.setName("Manipur");
		state16.setChiefMinister("President's Rule");
		
		states[16] = state16;
		
		State state17 = new State();
		state17.setName("Meghalaya");
		state17.setChiefMinister("Conrad Sangam");
		
		states[17] = state17;
		
		State state18 = new State();
		state18.setName("Mizoram");
		state18.setChiefMinister("Lalduhoma");
		
		states[18] = state18;
		
		State state19 = new State();
		state19.setName("Nagaland");
		state19.setChiefMinister("Neiphiu Rio");
		
		states[19] = state19;
		
		State state20 = new State();
		state20.setName("Odisha");
		state20.setChiefMinister("Mohan Charan Majhi");
		
		states[20] = state20;
		
		State state21 = new State();
		state21.setName("Puducherry");
		state21.setChiefMinister("N.Rangaswamy");
		
		states[21] = state21;
		
		State state22 = new State();
		state22.setName("Punjab");
		state22.setChiefMinister("Bhagwant Mann");
		
		states[22] = state22;
		
		State state23 = new State();
		state23.setName("Sikkim");
		state23.setChiefMinister("Prem Singh Tamang");
		
		states[23] = state23;
		
		State state24 = new State();
		state24.setName("Tamil Nadu");
		state24.setChiefMinister("M.K.Stalin");
		
		states[24] = state24;
		
		State state25 = new State();
		state25.setName("Tripura");
		state25.setChiefMinister("Manik Saha");
		
		states[25] = state25;
		
		State state26 = new State();
		state26.setName("Uttarakhand");
		state26.setChiefMinister("Pushkar Singh Dhami");
		
		states[26] = state26;
		
		State state27 = new State();
		state27.setName("Uttara Pradesh");
		state27.setChiefMinister("Yogi Adityanath");
		
		states[27] = state27;
		
		State state28 = new State();
		state28.setName("West Bengal");
		state28.setChiefMinister("Mamata Banerjee");
		
		states[28] = state28;
		
		
		country.setStates(states);
		
		System.out.println("Country and States:");
		System.out.println("Country: " + country.getName());
		
		State[] countryStates = country.getStates();
		for(int i = 0;i < countryStates.length;i++){
			if(countryStates[i]!=null){
			    System.out.println("State: " + countryStates[i].getName());
			    System.out.println("Chief Minister: " + countryStates[i].getChiefMinister());
			}
		}
	}
}