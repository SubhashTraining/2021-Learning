package FrameWork;

public class FrameWorkParameters {
	
	
	private String relativePath;
	private String runConfiguration;
	private boolean stopExecution;
	public static final FrameWorkParameters FRAMEWORK_PARAMETERS = new FrameWorkParameters();
	
	private FrameWorkParameters()
	{
		
	}
	
	private static FrameWorkParameters getInstance()
	{
		return FRAMEWORK_PARAMETERS;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public String getRunConfiguration() {
		return runConfiguration;
	}

	public void setRunConfiguration(String runConfiguration) {
		this.runConfiguration = runConfiguration;
	}

	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}

	
	

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
	
}
