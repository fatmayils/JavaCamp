package ucuncuHaftaOdev2;

public class UserManager {

	public void add(User user)
	{
		System.out.println(user.getName()+" adl� kullan�c� sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getName()+" adl� kullan�c� sistemden silindi");
	}
	public void update(User user) {
		System.out.println(user.getName()+" adl� kullan�c�n�n bilgileri g�ncellendi");
	}
	public void getAll()
	{
		System.out.println("Listelendi");
	}
	public void getByID(int id)
	{
		System.out.println("ID ye g�re listelendi");
	}
	public void logIn(User user)
	{
		System.out.println(user.getName()+"  adl� kullan�c� giri� yapt�...");
	}
	public void logOut(User user)
	{
		System.out.println(user.getName()+" adl� kullan�c� hesaptan ��k�� yapt�n�...");
	}
}
