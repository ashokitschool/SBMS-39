package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean payBill(double amt) {
		System.out.println("credit-card payment processing...");
		return true;
	}

}
