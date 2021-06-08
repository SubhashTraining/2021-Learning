package FrameWork;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Util {
	
	private Util()
	{
		
		
	}
	
	public static String getRelativePath()
	{
		
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		return relativePath;
	}
	
	public static Date getCurrentTime()
	{
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	public static String getFormatedCurrentTime(String format)
	{
		 
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date currentDate = Calendar.getInstance().getTime();
		return dateFormat.format(currentDate);
	
	}

	public static String getFileSeperator()
	{
		return File.separator;
	}
	
	
}
