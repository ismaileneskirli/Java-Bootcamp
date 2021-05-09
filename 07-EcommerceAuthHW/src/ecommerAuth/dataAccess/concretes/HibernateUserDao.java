package ecommerAuth.dataAccess.concretes;

import java.util.ArrayList;

import ecommerAuth.dataAccess.abstracts.UserDao;
import ecommerAuth.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	public void signUp(User user, ArrayList<User> users) {
		users.add(user);
		System.out.println(user.getName() + " signed up.");
	}
	
	
	public void signIn(User user){
		System.out.println(user.getName() + "signed in");
		
	}

}
