package ecommerAuth.business.abstracts;

import java.util.ArrayList;

import ecommerAuth.entities.concretes.User;

public interface UserService {
	
	public void signUp(User user, ArrayList<User> Users);
	public void signIn(User user, ArrayList<User> Users);

}
