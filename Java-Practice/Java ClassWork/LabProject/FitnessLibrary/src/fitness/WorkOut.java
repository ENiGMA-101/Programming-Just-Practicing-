package fitness;

public class WorkOut 
{
	private String name, type, status;

	public WorkOut(String name, String type) 
	{
		this.name = name;
		this.type = type;
		this.status = "Planned";
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public void startWorkOut() 
	{
		this.status = "In Progress";
	}

	public void completeWorkOut() 
	{
		this.status = "Completed";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null || !(obj instanceof WorkOut))
			return false;
		WorkOut other = (WorkOut) obj;
		return name.equals(other.name) && type.equals(other.type);
	}

	@Override
	public String toString() 
	{
		return "WorkOut [name=" + name + ", type=" + type + ", status=" + status + "]";
	}
}
