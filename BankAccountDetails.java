class BankAccountDetails {
    public static void main(String[] args) {
        String[] holders = {"Ramesh", "Suresh", "Geetha", "Divya", "Anil", "Radha", "Mohan", "Arjun", "Nisha", "Swathi"};
        int[] age = {45, 50, 38, 32, 40, 36, 55, 29, 33, 41};
        float[] interestRate = {4.5f, 4.7f, 5.0f, 4.2f, 4.8f, 4.6f, 5.2f, 4.1f, 4.9f, 4.3f};
        char[] accountType = {'S','C','S','S','C','S','C','S','S','C'};
        double[] balance = {150000.0, 200000.5, 98000.0, 120000.0, 220000.0, 115000.0, 180000.0, 90000.0, 102000.0, 134000.0};
        long[] accountNo = {1234567890L, 2345678901L, 3456789012L, 4567890123L, 5678901234L, 6789012345L, 7890123456L, 8901234567L, 9012345678L, 1012345678L};

        for(int i = 0; i < holders.length; i++) {
            System.out.println(holders[i]);
        }
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for(int i = 0; i < interestRate.length; i++) {
            System.out.println(interestRate[i]);
        }
        for(int i = 0; i < accountType.length; i++) {
            System.out.println(accountType[i]);
        }
        for(int i = 0; i < balance.length; i++) {
            System.out.println(balance[i]);
        }
        for(int i = 0; i < accountNo.length; i++) {
            System.out.println(accountNo[i]);
        }
    }
}
