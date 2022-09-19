
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class signup {

	@Test
	public void allMobilesMethod() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ahmadi.begum\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
      
         landingpage landingpage2 = new landingpage(driver);
         landingpage2.goTo();
         landingpage2.signupapplication("Ahmadi","begum","ahmadi21@gmail.com","ahmadi123" ,"05/04/2000","8624645812","Welcome to Qualitest");
         
        }
}