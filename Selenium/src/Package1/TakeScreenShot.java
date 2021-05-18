package Package1;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

public class TakeScreenShot {
	
	private static final TakeScreenShot takeScreenShot = new TakeScreenShot();
	
	private TakeScreenShot()
	{
		
	}
	
	public static TakeScreenShot getInstance()
	{
		return takeScreenShot;
	}
	
	public void printSreen()
	{
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		LocalDateTime time = LocalDateTime.now();
	
		Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		try {
			BufferedImage screenshot = new Robot().createScreenCapture(rectangle);
			try {
				ImageIO.write(screenshot, "jpg", new File("Screenshot_"+dtf.format(time).toString()+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
