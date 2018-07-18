package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {
	@Parameters("browser")
@Test
	public void testlogin(String value)
	{
		WebDriver driver=null;
		if(value.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	driver=new ChromeDriver();
		}
		else if(value.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			System.out.println("Not browser found");
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("Manishachand");
	driver.findElement(By.id("password")).sendKeys("Shiya@888");
	driver.findElement(By.name("commit")).click();
	String title=driver.getTitle();
	System.out.println(title);


Assert.assertEquals(title, "GitHub");

System.out.println("in test modify");
	
		}
}



