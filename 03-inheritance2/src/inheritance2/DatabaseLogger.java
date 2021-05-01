package inheritance2;

public class DatabaseLogger extends Logger {
	
	// Overriding super class log method, database logger have different log method.
	public void log(){
		System.out.println("Database logged");
	}

}
