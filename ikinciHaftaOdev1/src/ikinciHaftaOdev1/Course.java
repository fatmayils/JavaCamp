package ikinciHaftaOdev1;

public class Course {
int id;
int percentageOfCompletion;
String name;
String intructorName;
String imageUrl;
public Course() {
	
}
public Course(int id,int percentageOfCompletion,String name,String intructorName,String imageUrl) {
	this.id=id;
	this.percentageOfCompletion=percentageOfCompletion;
	this.intructorName=intructorName;
	this.imageUrl=imageUrl;
	this.name=name;
}
}
