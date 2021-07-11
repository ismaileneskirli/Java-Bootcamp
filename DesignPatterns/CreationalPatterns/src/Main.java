public class Main {

	public static void main(String[] args) {
		SingletonPattern logger = SingletonPattern.getInstance();
		logger.logMessageStart();
	}
}
