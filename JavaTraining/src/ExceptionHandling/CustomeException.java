package ExceptionHandling;

class MyException extends Exception
{
	public MyException(String Msg)
	{
		super(Msg);
	}
	
}
public class CustomeException {
	public static void main(String[] args) throws MyException
	{
		throw new MyException("my own exception created");
	}

}

/**
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

ublic void register(int age) throws InvalidAgeException {
if (age < 18) {
    throw new InvalidAgeException("Age must be 18 or above to register.");**/