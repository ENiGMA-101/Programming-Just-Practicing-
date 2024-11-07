package vol;

public class Volunteer {
	public String name;
	public String nid;
	public int age;
	public String gender;
	public String volunteerArea;
	public String trainingStatus;

	public Volunteer(String name, String nid, int age, String gender, String volunteerArea) {
		this.name = name;
		this.nid = nid;
		this.age = age;
		this.gender = gender;
		this.volunteerArea = volunteerArea;
		trainingStatus = "not started yet";
	}

	public String getName() {
		return name;
	}

	public String getNid() {
		return nid;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getvolunteerArea() {
		return volunteerArea;
	}

	public String gettrainingStatus() {
		return trainingStatus;
	}

	public void updatetrainingStatus(String NewtrainingStatus) {
		trainingStatus = NewtrainingStatus;
	}
	public String getStatus()
	{
		return trainingStatus;
	}
	public String toString() {
		return String.format("name=%s nid=%s age=%d gender=%s volunteerArea=%s trainingStatus=%s", name, nid, age,
				gender, volunteerArea, trainingStatus);
	}
}
