class UserDefinedArray{
	public static void main(String[] args){
		//datatype[] variablename
		String[] traineeNames = {"Shreyas","Kartik"};
		System.out.println(traineeNames);
		
		//traverse through array
		System.out.println(traineeNames.length);
		System.out.println(traineeNames[0]);
		System.out.println(traineeNames[1]);
		for(int i=0;i<traineeNames.length;i++){
			
		   System.out.println(traineeNames[i]); 
		}
		int[] numberofStudentsInBatch = {10,5,30,40,50};
		System.out.println(numberofStudentsInBatch);
		for(int i=0;i<numberofStudentsInBatch.length;i++){
		    System.out.println(numberofStudentsInBatch[i]);
		}
		
	}
}
		