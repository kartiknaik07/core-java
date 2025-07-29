class SmallestNum{
	public static void main(String[] args){
		int a = 25;
		int b = 10;
		int c = 55;
		
		if(a<b && a<c){
			System.out.println("a is a smallest number:" +a);
		}
		else if(b<a && b<c){
			System.out.println("b is a smallest number:" +b);
		}
		else{
			System.out.println("c is a smallest number:" +c);
		}
	}
}