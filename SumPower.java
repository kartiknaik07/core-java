public class SumPower{
    public static void main(String[] args){
        int number = 12;
        int quotient = number;
        int count = 0;
        while(quotient>0){//12,0
            count = count + 1;//1,2
            //quotient = quotient +1;
            quotient = quotient/10;//1,0
        }
        System.out.println("Count of digit is" +count);
        int rem = 0;
        int sum = 0;
        while(number>0){//12,1
            rem = number % 10;//2,
            //1%10=1
            int power = 1;
            for(int i=0;i<count;i++){
                power = power * rem;//2,
            }
        
        sum = sum + power;//
        number = number /10;//
        //1/10=0
        //rem = number %10;
        //15%10=5
        //sum = sum + rem ^ count;
        //number = number /10;
        //15/10
        }
        System.out.println("Sum is "+sum);

    }
}
