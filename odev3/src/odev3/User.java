package odev3;

public class User {

	private int id;
	private int password;
	private String course;

	public User() {

	}

	public User(int id, int password, String course) {

		this.id = id;
		this.password = password;
		this.course = course;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
