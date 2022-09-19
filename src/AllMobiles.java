import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class AllMobiles {

	@Test
	public void allMobilesMethod() throws InterruptedException {
        // TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmadi.begum\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        landingpage lp3 = new landingpage(driver);
        lp3.goTo();
        Thread.sleep(1000);
        lp3.AllMobiles("samsung","lenovo","apple");



   }



}