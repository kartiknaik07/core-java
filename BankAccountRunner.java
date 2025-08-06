class BankAccountRunner {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(9876543210L, "Shreyas", "SBI", "Udupi", 10000.00);
		System.out.println(b1.getAccountNo());
		System.out.println(b1.getHolderName());
		System.out.println(b1.getBankName());
		System.out.println(b1.getBranch());
		System.out.println(b1.getBalance());

		BankAccount b2 = new BankAccount(1234567890L, "Anup", "ICICI", "Ankola", 15000.00);
		System.out.println(b2.getAccountNo());
		System.out.println(b2.getHolderName());
		System.out.println(b2.getBankName());
		System.out.println(b2.getBranch());
		System.out.println(b2.getBalance());

		BankAccount b3 = new BankAccount(2233445566L, "Manthan", "HDFC", "Bengaluru", 20000.00);
		System.out.println(b3.getAccountNo());
		System.out.println(b3.getHolderName());
		System.out.println(b3.getBankName());
		System.out.println(b3.getBranch());
		System.out.println(b3.getBalance());

		BankAccount b4 = new BankAccount(1122334455L, "Sanat", "Axis", "Karwar", 12000.00);
		System.out.println(b4.getAccountNo());
		System.out.println(b4.getHolderName());
		System.out.println(b4.getBankName());
		System.out.println(b4.getBranch());
		System.out.println(b4.getBalance());

		BankAccount b5 = new BankAccount(6655443322L, "Bhavish", "Canara", "Mangaluru", 18000.00);
		System.out.println(b5.getAccountNo());
		System.out.println(b5.getHolderName());
		System.out.println(b5.getBankName());
		System.out.println(b5.getBranch());
		System.out.println(b5.getBalance());
	}
}