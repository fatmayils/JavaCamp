package eMailVerification.business.concretes;
import eMailVerification.business.abstracts.UserService;
import eMailVerification.core.GoogleAuthService;
import eMailVerification.dataAccess.abstracts.UserDao;
import eMailVerification.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private GoogleAuthService googleAuthService;
	public UserManager(UserDao userDao) {

		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		for(User userr:userDao.getAll())
		{
			if(user.geteMail()==userr.geteMail())
			{
				System.out.println("Bu mail zaten kullan�l�yor.Ba�ka bir mail ile kay�t olu�turunuz.");
			return;
			}
		}
		System.out.println("Kayd�n�z ba�ar�yla al�nd�.�yeli�inizi do�rulamak i�in "+user.geteMail()+" adl� hesab�n�z� kontrol edin"
				+ "\nG�nderdi�imiz ba�lant�ya t�klayarak �yeli�inizi tamamlay�n.");
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);	
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void login(String eMail, String password) {
	for(User user:userDao.getAll())
	{
		if(user.geteMail().equals(eMail)&&user.getPassword().equals(password))
		{
			System.out.println("Sisteme giri� yap�ld�.");
			return;
		}
	}
		System.out.println("Girdi�iniz �ifre ve parola e�le�memektedir.");
	}

}
