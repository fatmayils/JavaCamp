package eMailVerification.core;
import java.util.ArrayList;
import eMailVerification.registerWithGoogle.GoogleAuthManager;
//Hashmap kullan�m�n� pek anlayamad���mdan 2 ayr� liste olu�turdum:D
public class GoogleAuthManagerAdapter implements GoogleAuthService{
GoogleAuthManager google=new GoogleAuthManager();
ArrayList<String> mails=new ArrayList<String>() ;
ArrayList<String> passwords=new ArrayList<String>() ;
	@Override
	public void registerToSystem(String eMail, String password) {
		for(int i=0;i<mails.size();i++)
		{
			if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
			{
				System.out.println("Google ile kay�t ba�ar�s�z.Bu mail adresi kullan�l�yor.");
				return;
			}
		}
	mails.add(eMail);
	passwords.add(password);
	google.register(eMail, password);
	}

	@Override
	public void loginToSystem(String eMail, String password) {
		for(int i=0;i<mails.size();i++)
		{
			if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
			{
				google.login(eMail, password);
				return;
			}
		}
	System.out.println("Google ile giri� ba�ar�s�z.");
	}

}
