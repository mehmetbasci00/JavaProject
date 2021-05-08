package odev3;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor("Engin", "Demiroğ");
		instructor.setId(1);
		instructor.setFirsName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setPassword(235678);
		instructor.setCourse("Java Nitelikli Yazılımcı Yetiştirme Kursu");

		Student student = new Student("Mehmet", "Başçı");
		student.setId(1);
		student.setFirstName("Mehmet");
		student.setLastName("Başçı");
		student.setPassword(683945);
		student.setCourse("Java Nitelikli Yazılımcı Yetiştirme Kursu");

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
