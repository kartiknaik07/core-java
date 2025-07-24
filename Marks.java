import java.util.Scanner;
class Marks{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++){
			System.out.print("Enter marks of students " + i +": ");
		    int marks = sc.nextInt();
		   if(marks>=80 && marks<=100){
			 System.out.println("A");
		   }
		   else if(marks>=60 && marks<80){
			 System.out.println("B");
		   }
		   else if(marks>=35 && marks<60){
			 System.out.println("C");
		   }
		   else if(marks>=0 && marks<35){
             System.out.println("F");
		   }
		   else{
			 System.out.println("Invalid marks");
		   }
		}	
	}
}


