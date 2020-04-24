package maindemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MainDemo {
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.manage().window().maximize();
		WebElement Action = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[6]/a"));
		 Action.click();
		 WebElement drag = driver.findElement(By.xpath("//*[@id= \"draggable\"]"));
		 WebElement drop = driver.findElement(By.xpath("//*[@id= \"droppable\"]"));
		 
		 Thread.sleep(1000);
		 Actions a = new Actions(driver);
		 a.dragAndDrop(drag, drop).perform();
		
		 Thread.sleep(1000);
		
		 String expected ="Dropped";
		 WebElement textDrop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 String actual = textDrop.getText();
		 System.out.println("Original text is"+actual);
		 
		 WebElement num1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		 num1.click();
		 
		 WebElement num6 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
		 num6.click();
		 driver.close();
  }
}

		 
		 
 


	    

	  

