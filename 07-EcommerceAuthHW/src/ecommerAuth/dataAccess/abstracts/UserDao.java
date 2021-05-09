package ecommerAuth.dataAccess.abstracts;

import java.util.ArrayList;


import ecommerAuth.entities.concretes.User;

public interface UserDao {
	
	public void signUp(User user, ArrayList<User> Users);
	public void signIn(User user);

}
