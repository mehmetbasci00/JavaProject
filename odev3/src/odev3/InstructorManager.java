package odev3;

public class InstructorManager extends UserManager {
	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getCourse() + "Kurs ba�ar�yla olu�turuldu.");
	}

	public void addTeacherFirstName(Instructor instructor) {
		System.out.println(instructor.getFirsName() + " E�itmenin ad� ba�ar�l� bir �ekilde eklendi.");
	}

	public void addTeacherLastName(Instructor instructor) {
		System.out.println(instructor.getLastName() + " E�itmenin soyad� ba�ar�l� bir �ekilde eklendi");
	}

}
