package STRATEGY;

public class Cash extends PaymentStrategy {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid via cash!");
	}

}
