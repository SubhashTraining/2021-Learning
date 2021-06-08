package FrameWork;

public class FrameWorkException extends RuntimeException{
	
	/**
	 * The step name to be specified for the exception
	 */
	public String ErrorName="Error";
	
	/**
	 * Constructor to initialize the exception from the framework
	 * @param errorDescription The Exception message to be thrown
	 */
	public FrameWorkException(String errorDescription)
	{
		super(errorDescription);
		
	}
	
	
	/**
	 * Constructor to initialize the exception from the framework
	 * @param errorName The step name for the error
	 * @param errorDescription The Exception message to be thrown
	 */
	public FrameWorkException(String errorName,String errorDescription)
	{
		
		super(errorDescription);
		this.ErrorName=errorName;
		
	}
	
	
	
	public String getErrorName()
	{
		return this.ErrorName;
	}
}
