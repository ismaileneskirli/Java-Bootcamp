package inheritance;

public class CustomerManager {

	// Thanks to Polymorphism this manager can get classes inherited from Customer class.
	public void add(Customer customer) {
		System.out.println("Customer with no : " + customer.customerNumber + " added");
	}
}
