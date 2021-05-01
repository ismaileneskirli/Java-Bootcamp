
public class App {
	public static void main(String[] args) {
		OnlineStoreAccount enes = new OnlineStoreAccount.Builder(1L)
				.assignName("Ismail Enes KIRLI")
				.assignAddress("Turkey")
				.assignBudget(5000)
				.assignDiscountRate(10)
				.build();
		
		
		System.out.println(enes.getName());
		
	}
}
