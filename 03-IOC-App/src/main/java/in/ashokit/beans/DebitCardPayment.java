package in.ashokit.beans;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor ");
	}
	
	@Override
	public boolean payBill(double amt) {
		System.out.println("Debit-Card payment processing..");
		return true;
	}

}
