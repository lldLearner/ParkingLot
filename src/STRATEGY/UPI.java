package STRATEGY;

public class UPI extends PaymentStrategy {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub

		System.out.println(amount + " paid via upi!");
	}

}
