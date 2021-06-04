package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailCompose {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com/");
	driver.manage().window().maximize();
	Actions actions = new Actions(driver);
	
	//login to gmail
	driver.findElement(By.name("identifier")).sendKeys("priti3800@gmail.com");
	WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[1]"));
	actions.moveToElement(email).click().build().perform();
	
	
	driver.findElement(By.name("password")).sendKeys("9833131711");
	WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
	actions.moveToElement(password).click().build().perform();
	
	//Compose
	driver.findElement(By.xpath("//*[@id=\":m5\"]/div/div")).click();
	
	//send mail
	driver.findElement(By.xpath("//*[@id=\":rn\"]/div")).sendKeys("lifi@incubyte.co"); 				 //TO
	driver.findElement(By.xpath("//*[@id=\":ri\"]")).sendKeys("Incubyte");      					//subject
	driver.findElement(By.xpath("//*[@id=\":sn\"]")).sendKeys("Automation QA test for Incubyte");      //body
	driver.findElement(By.xpath("//*[@id=\":r8\"]")).click();           								//send btn
	
}
}
