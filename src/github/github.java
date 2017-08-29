package github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class github {
	WebDriver driver;
	@Test
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshit.n\\Desktop\\R\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=_UKkWZiCFq7y8Afo_orQCQ");
	}
}
