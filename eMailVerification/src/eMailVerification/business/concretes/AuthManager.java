package eMailVerification.business.concretes;
import eMailVerification.business.abstracts.AuthService;
import eMailVerification.business.abstracts.UserService;
import eMailVerification.business.abstracts.UserVerificationService;
import eMailVerification.entities.concretes.User;

public class AuthManager implements AuthService {

	UserVerificationService verificationService;
	UserService userService;
	public AuthManager(UserVerificationService verificationService,UserService userService) {
		this.verificationService = verificationService;
		this.userService=userService;
	}

	@Override
	public void register(User user) {
if(verificationService.isEmailValid(user.geteMail())&&user.getFirstName().length()>2&&
		user.getLastName().length()>2&&user.getPassword().length()>=6)
{
	userService.add(user);
	return;
	
}
	System.out.println("Kay�t ba�ar�s�z.Girdi�iniz bilgileri kontrol ediniz.\n"
			+ "�ifre en az 6 karakter,ad soyad en az 2 karakter den olu�mal�d�r."
			+ "\nGe�erli bir mail adresi girdi�inizden emin olunuz.");	
	}

	@Override
	public void login(String eMail, String password) {
		if(verificationService.isEmailValid(eMail))
				{
			userService.login(eMail,password);
				return;
				}
		System.out.println("Ge�erli bir eposta giriniz");
		
	}

}
