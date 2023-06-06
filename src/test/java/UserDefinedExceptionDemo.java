
public class UserDefinedExceptionDemo extends Exception {
	@Override
	public String getMessage() {
	String s="Employee not found";
	return s;
}
}
