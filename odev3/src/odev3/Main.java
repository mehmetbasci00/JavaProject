package odev3;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor("Engin", "Demiro�");
		instructor.setId(1);
		instructor.setFirsName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setPassword(235678);
		instructor.setCourse("Java Nitelikli Yaz�l�mc� Yeti�tirme Kursu");

		Student student = new Student("Mehmet", "Ba���");
		student.setId(1);
		student.setFirstName("Mehmet");
		student.setLastName("Ba���");
		student.setPassword(683945);
		student.setCourse("Java Nitelikli Yaz�l�mc� Yeti�tirme Kursu");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.createCourse(instructor);
		instructorManager.addTeacherFirstName(instructor);
		instructorManager.addTeacherLastName(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.addFirstName(student);
		studentManager.addLastName(student);
		studentManager.addPassword(student);

	}

}
