
public class OnlineStoreAccount {

	
	private Long id;
	private String name;
	private String address;
	private double budget;
	private double discountRate;
	
	// Problem statement : when there are so many attributes in constructor, it is possible to mix them
	// so that it can cause issue when passing parameter in the main or sth.
//	public OnlineStoreAccount(Long id, String name, String address, Long budget, Long discountRate) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.budget = budget;
//		this.discountRate = discountRate;
//	}
	
	
	// Builder pattern implementation 
	// Builder is an inner class
	public static class Builder {
		
		private Long id;
		private String name;
		private String address;
		private double budget;
		private double discountRate;
		
		
		// constructor with id prevents creating object without id, so db wont crush.
		public Builder(Long id) {
			this.id = id;
		}
		
		public Builder assignName(String name) {
			this.name = name;
			
			return this;
		}
		
		public Builder assignAddress(String address) {
			this.address = address;
			
			return this;
		}
		
		public Builder assignBudget(double budget) {
			this.budget = budget;
			
			return this;
		}
		
		public Builder assignDiscountRate(double discountRate) {
			this.discountRate = discountRate;
			
			return this;
		}
		
		// Probabilty of supplying wrong parameter is decreased !
		public OnlineStoreAccount build() {
			OnlineStoreAccount onlineStoreAccount = new OnlineStoreAccount();
			onlineStoreAccount.id = this.id;
			onlineStoreAccount.name = this.name;
			onlineStoreAccount.address = this.address;
			onlineStoreAccount.budget = this.budget;
			onlineStoreAccount.discountRate = this.discountRate;
			
			
			return onlineStoreAccount;
		}
	}// End of inner class
	
	// This is private because we want to use Builder class instead
	private OnlineStoreAccount() {
		
	}

	
	// getters and setters are not that important cause we use Builder class
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
