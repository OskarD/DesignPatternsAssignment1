package bank;

public class BranchPresident extends LoanHandler {
	
    static double LIMIT = 10000;

	@Override
	public boolean authorize(LoanRequest request) {
		// TODO Auto-generated method stub
		double amount = request.getAmount();
        if (amount <= LIMIT) {
            System.out.println(" The Branch President has authorized the Loan Request of: " + request);
            return true;
        } else {
        System.out.println("Loan Rquest of: " + request +  " couldn't be authorized.\n " + "reason: Amount too large");
        return false;
        }
	}
}
