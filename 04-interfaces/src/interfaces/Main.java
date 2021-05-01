package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer enes = new Customer(1,"Enes","KIRLI");
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger()};
		
		CustomerManager customerManagerWithSms = new CustomerManager(loggers);
		customerManagerWithSms.add(enes);

	}

}
