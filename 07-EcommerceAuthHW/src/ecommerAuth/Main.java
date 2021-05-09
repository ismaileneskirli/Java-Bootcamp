package ecommerAuth;

import java.util.ArrayList;


import ecommerAuth.business.abstracts.UserService;
import ecommerAuth.business.concretes.UserManager;
import ecommerAuth.core.EmailLogger;
import ecommerAuth.core.Logger;
import ecommerAuth.dataAccess.abstracts.UserDao;
import ecommerAuth.dataAccess.concretes.HibernateUserDao;
import ecommerAuth.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<User> users = new ArrayList<User>();
		User user = new User(1, "enes", "kirli", "ismailenes@gmail.com", "123123");
		User user2 = new User(2, "ismail", "kirli", "ismailenes@gmail.com", "123123");
		User user3 = new User(3, "ahmet", "mehmetoglu", "notvalidemail", "123123");
		
		Logger emailLogger = new EmailLogger();
		UserDao hibernateUserDao = new HibernateUserDao();
		UserService userManager = new UserManager(emailLogger, hibernateUserDao);
		
		userManager.signUp(user, users);
		userManager.signUp(user2, users);
		userManager.signUp(user3, users);
		
		
		
		
	}

}
