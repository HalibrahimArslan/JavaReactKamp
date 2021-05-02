package homeworkJava;

public class Lecturer {
	int id;
	String name;
	int lessonId;
	String authority;
	
	public Lecturer() {
		System.out.println("Lecturer oluþturuldu");
	}
	public Lecturer(int id,String name,int lessonId,String authority) {
		this.id=id;
		this.name=name;
		this.lessonId=lessonId;
		this.authority=authority;
		
		
	}
	

}
