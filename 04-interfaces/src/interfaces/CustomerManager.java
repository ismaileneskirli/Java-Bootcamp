package interfaces;

// Customer 	manager is dependant to Logger
// Loosely coupled ( preferred) - tightly coupled 
public class CustomerManager {

	private Logger[] loggers;

	// referance
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer added : " + customer.getFirstName());
		// runLoggers method is static so i can use it without creating an object.	
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Customer deleted : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
