package ucuncuHaftaOdev2;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" adlý öðrenci sisteme eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" adlý öðrenci sistemden silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adlý öðrenci sistemde güncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("Öðrenciler listelendi");
	}

	@Override
	public void getByID(int id) {
		System.out.println("Öðrenciler ID ye göre listelendi");
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+" adlý öðrenci siteme giriþ yaptý...");
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adlý öðrenci sistemden çýkýþ yaptý...");
	}

}
