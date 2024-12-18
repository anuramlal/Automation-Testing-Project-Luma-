package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.lumalogin;

public class lumalogintest<lcount> {
    WebDriver driver;
    

    @BeforeClass
    public void setup() {
        
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @Test
    public void testlogin() throws Exception {
        lumalogin ob = new lumalogin(driver);
        ob.setvalues("mekha", "ramlal", "mekharamla2075@gmail.com", "Mekha@2023", "Mekha@2023");
        ob.create();
        lumalogin ob1= new lumalogin(driver);
        ob1.titleveri();
         lumalogin ob2=new lumalogin(driver);
         ob2.countlinks();
         lumalogin ob3=new lumalogin(driver);
         ob3.mhover();
        lumalogin ob4=new lumalogin(driver);
        ob4.mhover1();
        lumalogin ob5=new lumalogin(driver);
        ob5.shipping();
        lumalogin ob6 = new lumalogin(driver);
    	ob6.selectCountry("IN");
    	lumalogin ob7 = new lumalogin(driver);
    	ob7.selectregion("550");
    	lumalogin ob8 = new lumalogin(driver);
    	ob8.next();
    	lumalogin ob9 = new lumalogin(driver);
    	ob9.orderdetails();
    	
    	
    	
        
        
        
    }
    
}
