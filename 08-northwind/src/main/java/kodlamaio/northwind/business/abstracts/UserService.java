package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.*;


public interface UserService {

	Result add(User User);
	DataResult<User> getByEmail(String email);
}
