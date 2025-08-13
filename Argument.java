class Argument{
	public static void main(String[] args){
		//command line arguments
		System.out.println("Printing Arguments");
		System.out.println(args.length);
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		String a = args[0];
		String b = args[1];
		System.out.println(a+b);
	}
}