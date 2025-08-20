package com.xworkz.program;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime=false;
        if(n<=1) {
            System.out.println("Not prime number");
        }else {


            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }

            }
            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }
    }
}
