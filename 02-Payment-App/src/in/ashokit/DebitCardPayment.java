package in.ashokit;

public class DebitCardPayment implements IPayment{
	
	@Override
	public boolean payBill(double amt) {
		System.out.println("debit-card payment processing...");
		//logic
		return true;
	}

}
