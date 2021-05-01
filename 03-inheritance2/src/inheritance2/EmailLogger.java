package inheritance2;

public class EmailLogger extends Logger{
	
	
	// Overriding super class log method, email logger have different log method.
	public void log(){
		System.out.println("Email sent");
	}

}
