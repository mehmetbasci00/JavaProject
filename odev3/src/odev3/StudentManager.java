package odev3;

public class StudentManager {
	public void addFirstName(Student student) {
		System.out.println(student.getFirstName() + " Ad�n�z ba�ar�l� bir �ekilde eklendi.");
	}

	public void addLastName(Student student) {
		System.out.println(student.getLastName() + " Soyad�n�z ba�ar�l� bir �ekilde eklendi.");
	}

	public void addPassword(Student student) {
		System.out.println(student.getPassword() + " �ifreniz ba�ar�l� bir �ekilde eklendi.");
	}
}
