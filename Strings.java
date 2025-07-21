import java.util.*;
class Strings{
	public static void main(String[] args){
		String name = "Kartik Naik";
		System.out.println(name);
		//Scanner sc = new Scanner(System.in);
		//String clg = sc.nextLine();
		//System.out.println(clg);
		//System.out.println(clg.length());
		System.out.println(name.length());
		String fn = "Virat";
		String ln = "Kohli";
		System.out.println(fn + " " + ln);
		
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		}
		
		if(fn.equals(ln)){
			System.out.println("T");
		}
		else{
			System.out.println("F");
		}
		
		System.out.println(name.substring(0,5));
	}
}