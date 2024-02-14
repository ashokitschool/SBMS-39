package in.ashokit;

public class RestaurantService {

	IPayment payment;
	
	public RestaurantService(IPayment payment) {
		this.payment  = payment;
	}
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void collectBill(double amt) {
		
		boolean status = payment.payBill(amt);

		if (status) {
			System.out.println("payment success.. thankyou..");
		} else {
			System.out.println("card declined...");
		}
	}

}
