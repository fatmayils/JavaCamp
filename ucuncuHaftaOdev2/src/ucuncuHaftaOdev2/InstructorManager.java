package ucuncuHaftaOdev2;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		
		System.out.println(user.getName()+" adl� e�itmen sisteme eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" adl� e�itmen sistemden silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adl� sistemde g�ncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("E�itmenler listelendi");
	}

	@Override
	public void getByID(int id) {
		System.out.println("E�itmenler ID ye g�re listelendi");
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+" adl� e�itmen siteme giri� yapt�...");
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adl� e�itmen sisteme giri� yapt�...");
	}

}
