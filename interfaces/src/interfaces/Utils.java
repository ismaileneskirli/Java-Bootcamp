package interfaces;

public class Utils {

	
	// When the methods are static you can use them without creating an object from class.
	// So why not use them everywhere ? -> it consumes memory so use them only if method is needed everywhere.
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
