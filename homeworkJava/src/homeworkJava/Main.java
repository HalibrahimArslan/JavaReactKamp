package homeworkJava;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1=new Lesson(1,"Math",85,"Engin Demirci","/imgPath");
		Lesson lesson2=new Lesson(2,"Computer",75,"Engin Baltaci","/imgPath");
		Lesson lesson3=new Lesson(3,"English",65,"Engin Oduncu","/imgPath");
		
		Lesson[] lessons={lesson1,lesson2,lesson3};
		
		for(Lesson lesson:lessons) {
			System.out.println(lesson.name);
		}
		
		
		
		Lecturer lecturer1=new Lecturer(1,"Arslan",1,"admin");
		Lecturer lecturer2=new Lecturer(2,"Harun",2,"advisor");
		
		Lecturer[] lecturers={lecturer1,lecturer2};
		
		for(Lecturer lecturer:lecturers) {
			System.out.println(lecturer.name);
		}
		
	}

}
