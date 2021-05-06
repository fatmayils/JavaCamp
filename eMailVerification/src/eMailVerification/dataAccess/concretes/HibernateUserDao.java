package eMailVerification.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import eMailVerification.dataAccess.abstracts.UserDao;
import eMailVerification.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	ArrayList<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		//sim�lasyon oldu�u i�in yeni bir class olu�turmak istemedim.Ondan dolay� bu katmanda mesaj� verdim.
		System.out.println("Do�rulama tamamland�");
	}

	@Override
	public void delete(User user) {
		
		users.remove(user);
	}

	@Override
	public void update(User user) {

	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
