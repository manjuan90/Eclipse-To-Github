package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingLaunch {
	public static void main(String[] args) {
		System.out.println("Base");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("ChromeBrowserLaunching");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
		
		
	}

}
