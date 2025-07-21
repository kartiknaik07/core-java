class Exam{
	static String subject = "Java";
	static int marks = 100;
	static char paperVersion = 'A';
	static int duration = 3;
	static String center = "SDIT";
	
	public static void main(String[] args){
		String subject = "Python";
		int marks = 50;
		char paperVersion = 'B';
		int duration = 2;
		String center = "MIt";
		
		System.out.println(subject);
		System.out.println(marks);
		System.out.println(paperVersion);
		System.out.println(duration);
		
		getsubject();
		getmarks();
		getpaperversion();
		getduration();
		getcenter();
		
	}
	public static void getsubject(){
		System.out.println(subject);
	}
	public static void getmarks(){
		System.out.println(marks);
	}
	public static void getpaperversion(){
		System.out.println(paperVersion);
	}
	public static void getduration(){
		System.out.println(duration);
	}
	public static void getcenter(){
		System.out.println(center);
	}
}
		