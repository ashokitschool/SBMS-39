package in.ashokit.beans;

public class RestaurantService {

	private IPayment payment;

	public RestaurantService() {
		System.out.println("RestaurantService : 0-param Constructor ");
	}

	public RestaurantService(IPayment payment) {
		System.out.println("RestaurantService : parm Constructor ");
		this.payment = payment;
	}

	public void processPayment(double amt) {
		boolean status = payment.payBill(amt);
		if (status) {
			System.out.println("Payment completed");
		} else {
			System.out.println("payment failed...");
		}
	}

}
