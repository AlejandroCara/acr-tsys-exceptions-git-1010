package Exceptions;

public class ExceptionTry extends Exception{
	
	private String msg = "";
	
	public ExceptionTry(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
}
