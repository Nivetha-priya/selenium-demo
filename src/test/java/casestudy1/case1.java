package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
public class case1
{
  @Test(priority=1)
  public void testregistration() 
  {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	 driver.findElement(By.name("userName")).sendKeys("Nivetha");
	 driver.findElement(By.name("firstName")).sendKeys("Nive priya");
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"err\"]")));
	 String expected="Available";
	 WebElement avail=driver.findElement(By.id("err"));
	 String a=avail.getText();
	 Assert.assertEquals(a, expected);
	 driver.findElement(By.name("lastName")).sendKeys("priya");
	 driver.findElement(By.name("password")).sendKeys("nive123");
	 driver.findElement(By.name("confirmPassword")).sendKeys("nive123");
	 driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[1]")).click();
     driver.findElement(By.id("emailaddress")).sendKeys("nivepriya@gmail.com");
	 driver.findElement(By.id("mobileNumber")).sendKeys("8300116854");
	 driver.findElement(By.name("dob")).sendKeys("08/06/1997");
	 driver.findElement(By.id("address")).sendKeys("Sri rangam ");
	 driver.findElement(By.id("securityQuestion")).sendKeys("What is your birth place");
	 driver.findElement(By.id("answer")).sendKeys("Trichy");
	 driver.findElement(By.name("Submit")).click();	
  }
 @Test(priority=2)
  public void testlogin()
  {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	 driver.findElement(By.name("userName")).sendKeys("TonyStark");
	 driver.findElement(By.name("password")).sendKeys("Stark123");
	 driver.findElement(By.name("Login")).click();
  }
}
