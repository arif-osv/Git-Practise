package parallel;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;
import com.qa.uat.pages.BaseInterface;
import com.qa.util.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshotpage  {


	public static  WebDriver driver;
	public   void takeScreenShot() {
		 driver = DriverFactory.getDriver();
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		ApplicationHooks.getScenario().attach(screenshot, "image/png", "scrrenshotName");
	    
		//hooksMethods.getScenario().attach(screenshot,"image/png", "scrrenshotName");
	}

    public static void tajeScreenShotWitAlert() throws AWTException, IOException {
    	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    	// BufferedImage image = new RObot().createScreenCapture(new Rectangle(0,0,1400,800));
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	ImageIO.write(image, "jpg", baos);
    	byte[] screenShot = baos.toByteArray();
    	ApplicationHooks.getScenario().attach(screenShot, "image/png", "scrrenshotName");
    
    	//below latest version on place of embed//
    //hooksMethods.getScenario().attach(screenshot,"image/png", "scrrenshotName");
    	
    }
    
    public void scrollToElement(WebElement element) {
    	WebDriver    driver =DriverFactory.getDriver();
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].scrollIntoView();", element);
    }
}
