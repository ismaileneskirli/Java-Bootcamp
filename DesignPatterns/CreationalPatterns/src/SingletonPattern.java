
public class SingletonPattern {

	// you can not create two objects of the same class, single access to objects
	// create a logger, report of tests, cache, thread pool
	
	// eager initialization
	//private static SingletonPattern logger = new SingletonPattern();
	
	private static SingletonPattern logger;
	private SingletonPattern() {
		
	}
	
	// lazy load.
	// sync = thread safe
	public static synchronized SingletonPattern getInstance () {
		if (logger == null) {
			logger = new SingletonPattern();
		}
		
		return logger;
	}
	
	
	public void logMessageStart() {
		System.out.println("start message ");
	}
	
	public void logMessageStop() {
		System.out.println("stop message ");
	}
	
	
}
