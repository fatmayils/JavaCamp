package ucuncuHaftaOdev2;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		
		System.out.println(user.getName()+" adlý eðitmen sisteme eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" adlý eðitmen sistemden silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adlý sistemde güncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("Eðitmenler listelendi");
	}

	@Override
	public void getByID(int id) {
		System.out.println("Eðitmenler ID ye göre listelendi");
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+" adlý eðitmen siteme giriþ yaptý...");
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adlý eðitmen sisteme giriþ yaptý...");
	}

}
