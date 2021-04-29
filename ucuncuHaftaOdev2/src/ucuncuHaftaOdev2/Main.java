package ucuncuHaftaOdev2;

public class Main {

	public static void main(String[] args) {
		User instructor=new Instructor(1,"Engin","Demiroğ","engindemirog@gmail.com","kodlamaio",5000,"Java003");
		User student=new Student(1,"Fatma","Yıldırım","fatmayildirim@gmail.com","12345","01237638936","x mahallesi y sokak z no");
		UserManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		instructorManager.getAll();
		instructorManager.getByID(1);
		instructorManager.logIn(instructor);
		instructorManager.logOut(instructor);
		UserManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		studentManager.getAll();
		studentManager.getByID(1);
		studentManager.logIn(student);
		studentManager.logOut(student);

	}
}
