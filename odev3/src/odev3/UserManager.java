package odev3;

public class UserManager {
	public void registerCourse(User user) {
		System.out.println(user.getCourse() + " Kursa ba�ar�l� bir �ekilde kay�t olundu.");
	}

	public void cancelRegistration(User user) {
		System.out.println(user.getCourse() + " Kurs kayd�n�z iptal edildi.");
	}

}
