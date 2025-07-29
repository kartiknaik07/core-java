class  StudentDetails{
	public static void main(String[] args){
		String[] names = {"Anup","Akash","Ajay","Bhavish","Dinesh","Guru","Vinyas","Rajat","Aditya","Shreyas"};
		int[] age = {22,24,26,28,24,27,23,21,20,25};
		float[] cgpa = {6.2f,5.7f,9.1f,8.5f,9.5f,7.2f,6.4f,5.5f,7.4f,8.2f};
		char[] grade = {'B','C','A','A','A','B','B','C','A','A'};
		double[] perc = {62.1,57.0,90.4,85.1,95.0,72.2,64.0,55.2,74.2,82.2};
		long[] addressPin = {500012L,500145L,500126L,500356L,500785L,500485L,500142L,501245L,502458L,502345L};
		
		
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		for(int i = 0; i < age.length; i++){
			System.out.println(age[i]);
		}
		for(int i = 0; i < cgpa.length; i++){
			System.out.println(cgpa[i]);
		}
		for(int i = 0; i < grade.length; i++){
			System.out.println(grade[i]);
		}
		for(int i = 0; i < perc.length; i++){
			System.out.println(perc[i]);
		}
		for(int i = 0; i < addressPin.length; i++){
			System.out.println(addressPin[i]);
		}
	}
}