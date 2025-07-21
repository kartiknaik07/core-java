/*class EvenOdd{
	public static void main(String[] args){
		System.out.println("Even Numbers");
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		System.out.println("Odd Numbers");
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		System.out.println("Divisible by 3");
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println(i);
			}
				
		}
		System.out.println("Divisible by 4");
		for(int i=1;i<=100;i++){
			if(i%4==0){
				System.out.println(i);
			}
				
		}
	}
}*/
	
class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            }
            if (i % 2 != 0) {
                System.out.println(i + " is Odd");
            }
            if (i % 3 == 0) {
                System.out.println(i + " is Divisible by 3");
            }
            if (i % 4 == 0) {
                System.out.println(i + " is Divisible by 4");
            }

            System.out.println("----------------------");
        }
    }
}

/*class EvenOdd {
    public static void main(String[] args) {
        String evens = "Even Numbers:\n";
        String odds = "Odd Numbers:\n";
        String div3 = "Divisible by 3:\n";
        String div4 = "Divisible by 4:\n";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evens += i + " ";
            } else {
                odds += i + " ";
            }
            if (i % 3 == 0) {
                div3 += i + " ";
            }
            if (i % 4 == 0) {
                div4 += i + " ";
            }
        }

        System.out.println(evens);
        System.out.println(odds);
        System.out.println(div3);
        System.out.println(div4);
    }
}*/

