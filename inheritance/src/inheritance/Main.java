package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// polymorphism exercise.
		IndividualCustomer Enes = new IndividualCustomer();
		Enes.customerNumber = "12312321";
		
		CustomerManager customerManager = new CustomerManager();		
		AnotherCustomer anotherCustomer = new AnotherCustomer();
		anotherCustomer.customerNumber = "1123414";
//		customerManager.add(Enes);
//		customerManager.add(anotherCustomer);
		
		Customer[] customers = { Enes, anotherCustomer };
		customerManager.multipleAdd(customers);
	}

}
