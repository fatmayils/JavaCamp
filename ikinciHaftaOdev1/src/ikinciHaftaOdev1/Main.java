package ikinciHaftaOdev1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1=new Instructor(1,"Engin Demiro�");
		Instructor instructor2=new Instructor(3,"Kerem Var��");
		Instructor instructor3=new Instructor(3,"Murat Kurtbo�an");
		Instructor[] instructors= {
				instructor1,instructor2,instructor3
		};
System.out.println("E�itmenler************************************");
		for(Instructor i:instructors)
		{
			System.out.println(i.name);
		}
		Category category1=new Category(1,"Java");
		Category category2=new Category(1,"C#");
		Category category3=new Category(1,"React");
		Category[] categories= {
				category1,category2,category3
		};
		System.out.println("Kategoriler*************************************");
		for(Category i:categories)
		{
			System.out.println(i.name);
		}
		System.out.println("Kurslar***********************************************");
		Course course1=new Course(1,90,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� C#","Engin Demiro�","./c#");
		Course course2=new Course(1,90,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� Java","Engin Demiro�","./java");
		Course course3=new Course(1,90,"Programlamaya Giri� Temel","Engin Demiro�","./temel");
		Course[] courses= {
				course1,course2,course3
		};
		
		for(Course i:courses)
		{
			System.out.println(i.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
	}

}
