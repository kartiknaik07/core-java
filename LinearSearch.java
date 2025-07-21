/*import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		
		
		int number[] = new int[size];
		
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			
			number[i] = sc.nextInt();
		}
		
		System.out.println("The elements are:");

		for(int i=0;i<number.length;i++){
			System.out.println(number[i]);
		}
		
	    System.out.println("----------------------------");
		System.out.println("LINEAR SEARCH");
		System.out.println("Enter the element to be search:");
		int x = sc.nextInt();
		for(int i=0;i<number.length;i++){
			if(number[i]==x){
				System.out.println("Element found at index:" + i);
			}
		}
	}
}*/
import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		String names[] = new String[3];
		Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
			names[i] = sc.next();
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
}