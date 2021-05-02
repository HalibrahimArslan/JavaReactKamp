package homeworkJava;

public class Lesson {
	int id;
	String name;
	int levelOfCompleted;
	String lecturerName;
	String lessonPicture;
	public Lesson() {
		System.out.println("Lesson oluþturuldu");
	}
	public Lesson(int id,String name,int levelOfComplete,String lecturerName,String lessonPicture) {
		this.id=id;
		this.name=name;
		this.levelOfCompleted=levelOfComplete;
		this.lecturerName=lecturerName;
		this.lessonPicture=lessonPicture;
		
	}
}
