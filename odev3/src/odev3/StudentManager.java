package odev3;

public class StudentManager {
	public void addFirstName(Student student) {
		System.out.println(student.getFirstName() + " Adınız başarılı bir şekilde eklendi.");
	}

	public void addLastName(Student student) {
		System.out.println(student.getLastName() + " Soyadınız başarılı bir şekilde eklendi.");
	}

	public void addPassword(Student student) {
		System.out.println(student.getPassword() + " Şifreniz başarılı bir şekilde eklendi.");
	}
}
