package casestudy1;
 import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NewTest 
{
	WebDriver driver;	
  @Test(priority=1,enabled=false)
  public void testRegistration() 
  {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	WebElement SignUp=driver.findElement(By.linkText("SignUp"));
	SignUp.click();
	WebElement userName=driver.findElement(By.id("userName"));
	userName.sendKeys("durga");
	WebElement fName=driver.findElement(By.id("firstName"));
	fName.click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"err\"]")));
	String expected="Available";
	WebElement avail=driver.findElement(By.id("err"));
	String a=avail.getText();
	Assert.assertEquals(a,expected);
	fName.sendKeys("kassni");
	WebElement lName=driver.findElement(By.id("lastName"));
	lName.sendKeys("sre");
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("Password123");
	WebElement cpass=driver.findElement(By.id("pass_confirmation"));
	cpass.sendKeys("Password123");
	WebElement gen=driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[1]"));
	gen.click();
	WebElement email=driver.findElement(By.id("emailAddress"));
	email.sendKeys("durgasre82@gmail.com");
	WebElement mob=driver.findElement(By.id("mobileNumber"));
	mob.sendKeys("9997676898");
	WebElement dob=driver.findElement(By.name("dob"));
	dob.sendKeys("17/22/1997");
	WebElement add=driver.findElement(By.id("address"));
	add.sendKeys("Perungalathur");
	WebElement que=driver.findElement(By.id("securityQuestion"));
	que.click();
	Actions acc=new Actions(driver);
	acc.sendKeys(Keys.ENTER).perform();
	WebElement ans=driver.findElement(By.id("answer"));
	ans.sendKeys("chennai-125");
	WebElement reg=driver.findElement(By.name("Submit"));
	reg.click();	
  }
  @Test(priority=2)
  public void testLogin() 
  {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	     driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	     WebElement userName=driver.findElement(By.id("userName"));
	     userName.sendKeys("durga");
	     WebElement pass=driver.findElement(By.id("password"));
	     pass.sendKeys("Password123");
	     WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	     login.click(); 
  }
  @Test(priority=3)
  public void testCart() 
  {
	  WebElement cart=driver.findElement(By.name("products"));
 	 cart.sendKeys("headphone");
 	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
 	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
   driver.findElement(By.xpath("//[@id=\"header\"]/div[1]/div/div/div[2]/div/a[3]")).click();
  }
  @Test(priority=4,enabled=false)
  public void testPayment()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    WebElement signin=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
	    signin.click();
     	WebElement userName=driver.findElement(By.id("userName"));
	    userName.sendKeys("nivetha");
	    WebElement pass=driver.findElement(By.id("password"));
	    pass.sendKeys("Password123");
	    WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
	    login.click();
	    WebElement cart=driver.findElement(By.name("products"));
 	    cart.sendKeys("headphone");
 	    WebElement find=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
 	    find.click();
 	    WebElement addcart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
 	    	addcart.click();
 	    		WebElement cartlist=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
     cartlist.click();
     	WebElement checkout=driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a"));
     	checkout.click();
      	WebElement payment =driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
     	payment.click();
     	WebDriverWait wait=new WebDriverWait(driver,30);
  		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")));
  		WebElement bank=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i"));
  		bank.click();
  		 WebElement cont=driver.findElement(By.id("btn"));
     	cont.click();
     	WebElement user=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]"));
     	user.sendKeys("123456");
     	WebElement ps=driver.findElement(By.name("password"));
      	ps.sendKeys("Pass@456");
      	WebElement plogin=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input"));
      	plogin.click();
      	WebElement translog=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input"));
      	translog.sendKeys("Trans@456");
      	WebElement paynow=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input"));
      	paynow.click();
  }
}

