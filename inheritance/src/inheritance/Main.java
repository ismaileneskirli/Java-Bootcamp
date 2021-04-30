package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		IndividualCustomer Enes = new IndividualCustomer();
		Enes.customerNumber = "12312321";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(Enes);
	}

}
