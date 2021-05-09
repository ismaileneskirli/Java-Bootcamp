package ecommerAuth.core;

import ecommerAuth.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void authenticate() {
		// TODO Auto-generated method stub
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.authenticate();
		
		
	}
	

}
