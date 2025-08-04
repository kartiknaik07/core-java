class Pattern3{
	public static void main(String[] args){
		int rows =2;
		int columns =2;
		
		for(int i=0;i<rows;i++){
			for(int j=5;j>=columns;j--){
				System.out.print(j-1 + " ");
			}
			System.out.println();
		}
	}
}