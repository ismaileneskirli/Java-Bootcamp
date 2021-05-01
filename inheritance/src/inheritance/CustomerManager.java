package inheritance;

public class CustomerManager {

	// Thanks to Polymorphism this manager can get classes inherited from Customer class.
	public void add(Customer customer) {
		System.out.println("Customer with no : " + customer.customerNumber + " added");
	}
	
	
	// bulk insert
	
	public void multipleAdd (Customer[] customers) {
		for (Customer customer : customers) {
			// above function called for each customer !	
			add(customer);
		}
	}
}
