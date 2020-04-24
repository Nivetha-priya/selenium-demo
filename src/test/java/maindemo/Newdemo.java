package maindemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Newdemo {
	WebDriver driver;
	@Test
	public void testregistration() throws InterruptedException 
	 {
	
   System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://uitestpractice.com/");
	 driver.manage().window().maximize();
	 WebElement Action = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[6]/a"));
      Action.click();
	 WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	 WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	 
	 Thread.sleep(10000);
	 
	 Actions a = new Actions(driver);
	 a.dragAndDrop(drag, drop).perform();
	 
	 Thread.sleep(1000);
	 
     WebElement textDrop = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	 String actual = textDrop.getText();
	 System.out.println("Original text is "+actual);
	 
	 WebElement num1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	 JavascriptExecutor js =( JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('style','background:yellow;');", num1);
	 num1.click();
	 
	 WebElement num6 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
	 
	 js.executeScript("arguments[0].setAttribute('style','background:yellow;');", num6);
	 num6.click();
	 
	 
	 WebElement num11 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[11]"));
	 
	 js.executeScript("arguments[0].setAttribute('style','background:yellow;');", num11);
	 num11.click();
	 
	 
	 
	 
}
	
}


