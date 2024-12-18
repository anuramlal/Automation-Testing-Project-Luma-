package page;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class lumalogin {
	WebDriver driver;

	By lumafname = By.id("firstname");
	By lumalname = By.id("lastname");
	By email = By.id("email_address");
	By pswd = By.id("password");
	By conpassword = By.id("password-confirmation");
	By createacc = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");

	public lumalogin(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
	}

	public void setvalues(String firstname, String lastname, String email_adress, String password,
			String passwordconfirmation) {
		driver.findElement(lumafname).sendKeys(firstname);
		driver.findElement(lumalname).sendKeys(lastname);
		driver.findElement(email).sendKeys(email_adress);
		driver.findElement(pswd).sendKeys(password);
		driver.findElement(conpassword).sendKeys(passwordconfirmation);
	}

	public void create() {
		driver.findElement(createacc).click();
	}

	public void titleveri() {
		String act = driver.getTitle();
		String exp = "My Account";

		if (act.equals(exp)) {
			System.out.println(" Title Pass");
		} else {
			System.out.println("Titlt Fail");

		}
	}

	public void countlinks() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("No of links=" + li.size());
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img")).click();
	}

	public void mhover() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
		// explicit
		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		Actions act = new Actions(driver);
		Thread.sleep(2000);

		WebElement a = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
		act.moveToElement(a);
		act.perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement b = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
		act.moveToElement(b);
		act.perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dress = driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]/span"));
		act.moveToElement(dress);
		act.perform();
		dress.click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/a/span/span/img"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
	}

	public void mhover1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Implicit wait
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		WebElement a1 = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
		act.moveToElement(a1);
		act.perform();
		a1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement b1 = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
		act.moveToElement(b1);
		act.perform();
		b1.click();
	}

	public void shipping() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[3]/div/input"))
				.sendKeys("home");
		driver.findElement(By.xpath(
				"/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input"))
				.sendKeys("vazhakala kakkanad");
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input"))
				.sendKeys("kakkanad");
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input"))
				.sendKeys("682030");
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")).sendKeys("9074803258");
	}

	public void selectCountry(String countryName) {
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")));
		dropdown.selectByValue(countryName);
	}
		public void selectregion(String regionName) throws Exception {
			Select dropdown1=new Select(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")));
			dropdown1.selectByValue(regionName);
			Thread.sleep(9000);
		}
		public void next() throws Exception {
			driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		}
		public void orderdetails() throws Exception
		{
		    WebElement b = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/a"));
		    b.click();
		    String originalWindow = driver.getWindowHandle();
		    
		    Set<String> allWindows = driver.getWindowHandles();
		  
		    for (String windowHandle : allWindows) { 
		    	if (!windowHandle.equals(originalWindow)) {
		    }
		    Thread.sleep(3000);
		    Alert a=driver.switchTo().alert();
		    a.accept();
		    }
		    

              
        	
      	
		}  
}
         
	
		
	


