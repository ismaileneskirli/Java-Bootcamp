package ecommerAuth.business.concretes;

import java.util.ArrayList;

import ecommerAuth.business.abstracts.UserService;
import ecommerAuth.core.Logger;
import ecommerAuth.dataAccess.abstracts.UserDao;
import ecommerAuth.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService{

	Logger logger ;
	UserDao userDao;
	public UserManager(Logger logger, UserDao userDao) {
		this.logger = logger;
		this.userDao = userDao;
	}
	
	@Override
	public void signUp(User user, ArrayList<User> users) {
		// TODO Auto-generated method stub
		// password must be at least 6 charachter.
		if (user.getPassword().length() < 6) {
			System.out.println("Your password length is less than 6, please chose appropriate password.");
			return ;
		}
		
		// email must be in email format.
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPattern.matcher(user.geteMail());
		if ( !matcher.find()) {
			System.out.println("your mail is not in the right format.");
			return;
		}
		
		// email must not be used before. 
		if (users != null) {
		for ( User xUser : users) {
			// email is used before 
			if (user.geteMail() == xUser.geteMail()) {
				System.out.println("Email already used");
				return ;
			}
		}
		}
		
		// name and lastName must be at least 2 characters long 
		if ( user.getName().length() < 2 || user.getLastName().length() < 2  )
		{
			System.out.println("name and lastName must be at least 2 characters long ");
			return ;
		}
		
		logger.log(user.geteMail());
		userDao.signUp(user, users);
		System.out.println("signed up successfully ");
		
	}

	@Override
	public void signIn(User user, ArrayList<User> users) {
		// TODO Auto-generated method stub
		
	}

	
	
}
