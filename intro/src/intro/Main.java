package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		ProductManager manager = new ProductManager();
		
		Product product = new Product(1,"laptop",3500,"very nice laptop",10);
		manager.addToCart(product);
		System.out.println(product.getUnitPriceAfterDiscount());
	
		
		
	}

}
