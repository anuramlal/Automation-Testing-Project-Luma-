package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class titlevarification {
	WebDriver driver;

	public titlevarification(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

}
