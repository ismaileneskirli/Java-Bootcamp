package ecommerAuth.core;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Authentiation mail sent to this address  : " + message);
		
	}

}
