package kodlamaio.northwind.core.utilities.results;


// Birden fazla veri tipi olabileceği zaman generic yapı <T>
public class DataResult <T> extends Result {

	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		// TODO Auto-generated constructor stub
		this.data = data;
	
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		// TODO Auto-generated constructor stub
		this.data = data;
	
	}

	public T getData() {
		return this.data;
	}

	
	
}
