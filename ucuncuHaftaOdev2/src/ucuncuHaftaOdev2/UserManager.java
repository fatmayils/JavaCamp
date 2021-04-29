package ucuncuHaftaOdev2;

public class UserManager {

	public void add(User user)
	{
		System.out.println(user.getName()+" adlý kullanýcý sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getName()+" adlý kullanýcý sistemden silindi");
	}
	public void update(User user) {
		System.out.println(user.getName()+" adlý kullanýcýnýn bilgileri güncellendi");
	}
	public void getAll()
	{
		System.out.println("Listelendi");
	}
	public void getByID(int id)
	{
		System.out.println("ID ye göre listelendi");
	}
	public void logIn(User user)
	{
		System.out.println(user.getName()+"  adlý kullanýcý giriþ yaptý...");
	}
	public void logOut(User user)
	{
		System.out.println(user.getName()+" adlý kullanýcý hesaptan çýkýþ yaptýný...");
	}
}
