package fitness;

public class InvalidUserException extends Exception 
{
	public InvalidUserException(String id, String userType) 
	{
		super(String.format("%s with ID:%s is not a valid user.", userType, id));
	}
}