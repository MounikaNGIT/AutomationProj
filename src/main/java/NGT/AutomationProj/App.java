package NGT.AutomationProj;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
	public static WebDriver driver;
	
    public static void main( String[] args )
    {
        
        ChromeOptions options = new ChromeOptions();
		options.addArguments(
		    ChromeOptions.CAPABILITY,        
		    "--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		String Title = driver.getTitle();
		System.out.println("Page Title - " + Title);
		//driver.quit();

    	
    }
}
