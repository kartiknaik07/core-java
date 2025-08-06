class BankAccount {
	private long accountNo;
	private String holderName;
	private String bankName;
	private String branch;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(long accountNo, String holderName) {
		this.accountNo = accountNo;
		this.holderName = holderName;
	}

	public BankAccount(long accountNo, String holderName, String bankName) {
		this(accountNo, holderName);
		this.bankName = bankName;
	}

	public BankAccount(long accountNo, String holderName, String bankName, String branch) {
		this(accountNo, holderName, bankName);
		this.branch = branch;
	}

	public BankAccount(long accountNo, String holderName, String bankName, String branch, double balance) {
		this(accountNo, holderName, bankName, branch);
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getBankName() {
		return bankName;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance() {
		return balance;
	}
}


