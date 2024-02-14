package in.ashokit;

public class Test {

	public static void main(String[] args) {

		RestaurantService service = 
				new RestaurantService(new DebitCardPayment()); // ci
		
		//service.payment = new DebitCardPayment(); // FI
		
		//service.setPayment(new CreditCardPayment()); // SI
		
		service.collectBill(1345.90);

	}

}
