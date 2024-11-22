package fitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class User 
{
	private String name, fitnessId;
	private int age;
	private float weight, height;
	private LocalDate joiningDate;

	public User(String name, int age, float weight, float height) 
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.fitnessId = String.format("%04d", new Random().nextInt(10000));
		this.joiningDate = LocalDate.now();
	}

	public void addPrefixToId(String prefix) 
	{
		this.fitnessId = prefix + this.fitnessId;
	}

	public String getName() 
	{
		return name;
	}

	public String getFitnessId() 
	{
		return fitnessId;
	}

	public int getAge() 
	{
		return age;
	}

	public float getWeight() 
	{
		return weight;
	}

	public float getHeight() 
	{
		return height;
	}

	public LocalDate getJoiningDate() 
	{
		return joiningDate;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setFitnessId(String fitnessId) 
	{
		this.fitnessId = fitnessId;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setWeight(float weight) 
	{
		this.weight = weight;
	}

	public void setHeight(float height) 
	{
		this.height = height;
	}

	public void setJoiningDate(String joiningDate) 
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(joiningDate, format);
		this.joiningDate = date;
	}

	@Override
	public String toString() 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String joinDate = joiningDate.format(formatter);
		return String.format("User[name=%s, fitnessId=%s, age=%d, weight=%.1f, height=%.1f, joiningDate=%s]",
				name, fitnessId, age, weight, height, joinDate);
	}

	public abstract String toString(boolean details);

	@Override
    public boolean equals(Object obj) 
	{
        if (obj == null || !(obj instanceof User)) 
        	return false;
        User other = (User) obj;
        return fitnessId.equals(other.fitnessId);
    }
}