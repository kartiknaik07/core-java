package com.xworkz.program;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int given_num=153;
        int n = 153;
        int q = n;
        int count = 0;
        while(q>0){
            q = q/10;
            count = count + 1;
        }
        int rem=0;
        int sum=0;
        while(n>0) {
            rem = n % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * rem;
            }

            sum = sum + power;
            n = n / 10;
        }
        System.out.println(sum);
        if(given_num==sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }


    }
}
