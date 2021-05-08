package odev3;

public class InstructorManager extends UserManager {
	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getCourse() + "Kurs baþarýyla oluþturuldu.");
	}

	public void addTeacherFirstName(Instructor instructor) {
		System.out.println(instructor.getFirsName() + " Eðitmenin adý baþarýlý bir þekilde eklendi.");
	}

	public void addTeacherLastName(Instructor instructor) {
		System.out.println(instructor.getLastName() + " Eðitmenin soyadý baþarýlý bir þekilde eklendi");
	}

}
