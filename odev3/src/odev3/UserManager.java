package odev3;

public class UserManager {
	public void registerCourse(User user) {
		System.out.println(user.getCourse() + " Kursa başarılı bir şekilde kayıt olundu.");
	}

	public void cancelRegistration(User user) {
		System.out.println(user.getCourse() + " Kurs kaydınız iptal edildi.");
	}

}
