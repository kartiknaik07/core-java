class PassportRunner {
	public static void main(String[] args) {
		Passport p1 = new Passport(1001, "Shreyas", "Indian", "Delhi", 2032);
		System.out.println(p1.getPassportNo());
		System.out.println(p1.getHolderName());
		System.out.println(p1.getNationality());
		System.out.println(p1.getIssuePlace());
		System.out.println(p1.getExpiryYear());

		Passport p2 = new Passport(1002, "Anup", "Indian", "Bengaluru", 2031);
		System.out.println(p2.getPassportNo());
		System.out.println(p2.getHolderName());
		System.out.println(p2.getNationality());
		System.out.println(p2.getIssuePlace());
		System.out.println(p2.getExpiryYear());

		Passport p3 = new Passport(1003, "Manthan", "Indian", "Mumbai", 2030);
		System.out.println(p3.getPassportNo());
		System.out.println(p3.getHolderName());
		System.out.println(p3.getNationality());
		System.out.println(p3.getIssuePlace());
		System.out.println(p3.getExpiryYear());

		Passport p4 = new Passport(1004, "Sanat", "Indian", "Chennai", 2029);
		System.out.println(p4.getPassportNo());
		System.out.println(p4.getHolderName());
		System.out.println(p4.getNationality());
		System.out.println(p4.getIssuePlace());
		System.out.println(p4.getExpiryYear());

		Passport p5 = new Passport(1005, "Bhavish", "Indian", "Kolkata", 2033);
		System.out.println(p5.getPassportNo());
		System.out.println(p5.getHolderName());
		System.out.println(p5.getNationality());
		System.out.println(p5.getIssuePlace());
		System.out.println(p5.getExpiryYear());
	}
}