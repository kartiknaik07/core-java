class CountDigit{
	public static void main(String[] args){
		int num = 123;
		//123/10=12
		//123%10=3
		//12%10=2>0
		//12%10=1
		//1%10=1
		//1/10=0
		
		int count = 0;
		int quotient = num;
		while(quotient>0){//123,12,1
			quotient = quotient /10;//12,1,0
			count = count+1;//1,2,3
		}
		System.out.println("Count of digit is " + count);
	}
}