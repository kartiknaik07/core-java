class Pattern5{
	public static void main(String[] args){
		int rows =2;
		int columns =8;
		
		for(int i=0;i<rows;i++){
			for(int j=1;j<=columns;j++){
				if(j%2!=0){
				System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}