class Country1{
	private String name;
	private int numberOfStates;
	private State[] states;
	private String primeMinister;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setStates(State[] states){
		this.states = states;
	}
	public State[] getStates(){
		return states;
	}
}