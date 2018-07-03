package Example.EXP;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
@Test
public void testGitHublogic()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("pattannahida");
	driver.findElement(By.id("password")).sendKeys("Fossil@99");
	driver.findElement(By.name("commit")).click();
	String title=driver.getTitle();
	Assert.assertEquals(title, "Github");
	System.out.println("continue with testcode");
	
}
}
