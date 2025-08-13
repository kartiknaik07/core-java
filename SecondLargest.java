class SecondLargest{
	public static void main(String[] args){
		int[] a={10,30,20,50,60};
		int largest =a[0];
		int secondLargest =a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>largest){
			  largest = a[i];
				
			}
		}
		for(int i=1;i<a.length;i++){
			if(a[i]<largest && a[i]>secondLargest){
			  secondLargest = a[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);

	}
}