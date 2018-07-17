import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
@Test
	public void testlogin()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("Manishachand");
	driver.findElement(By.id("password")).sendKeys("Shiya@888");
	driver.findElement(By.name("commit")).click();
	String title=driver.getTitle();
	System.out.println(title);
<<<<<<< HEAD
	if(title=="Sign in to GitHub � GiHub")
=======
	if(title=="Sign in to GitHub · GitHub")
>>>>>>> branch 'master' of https://github.com/Manishachand/Eclips.git
	{
		System.out.println("stopp[");
	}
		else
		{
			System.out.println("Contiasgsnue");
	//Assert.assertEquals(title, "Sign in to GitHub · GitHub");
	
		}
	///Assert.assertEquals(title, "Sign in to GitHub · GitHub");
}
}
