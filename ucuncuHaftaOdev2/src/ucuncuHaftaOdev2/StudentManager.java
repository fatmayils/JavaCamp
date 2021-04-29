package ucuncuHaftaOdev2;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" adl� ��renci sisteme eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" adl� ��renci sistemden silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adl� ��renci sistemde g�ncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("��renciler listelendi");
	}

	@Override
	public void getByID(int id) {
		System.out.println("��renciler ID ye g�re listelendi");
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+" adl� ��renci siteme giri� yapt�...");
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adl� ��renci sistemden ��k�� yapt�...");
	}

}
