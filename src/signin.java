import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class signin {

	@Test
	public void allMobilesMethod() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmadi.begum\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get("https://mobileworld.banyanpro.com/");
         Thread.sleep(2000);
         landingpage landingpage = new landingpage(driver);
         landingpage.goTo();
         Thread.sleep(2000);
         landingpage.signinapplication("Ahmadi","ahmadi123");
         Thread.sleep(1000);  
       }
}