class SecondSmallest{
	public static void main(String[] args){
		int[] arr={45,20,15,18,56};
		int smallest = arr[0];
        int secondSmallest = arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>smallest && arr[i]<secondSmallest){
				secondSmallest = arr[i];
			}
		}
				
		System.out.println("Second Smallest :" + secondSmallest);
	}
}