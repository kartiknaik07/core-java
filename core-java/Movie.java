class Movie {
	static String name = "KGF";
	static String actor= "Yash";
	static int duration= 3;
	
	public static void main(String[] args) {
		String movieName=getname();
		System.out.println("Name:" + movieName);
		String actorName=getactor();
		System.out.println("Actor:" + actorName);
		int mduration=getduration();
		System.out.println("Duration:" + mduration);
		cast();
		Movie.cast();
		
	}
	public static String getname(){
		return name;
	}
	public static String getactor(){
		return actor;
	}
	public static int getduration() {
		return duration;
	}
	
    public static void cast(){
		System.out.println("Actor " + actor + " was acted in " + name + " movie.Which has " + duration + " hours of duration.");
}
}