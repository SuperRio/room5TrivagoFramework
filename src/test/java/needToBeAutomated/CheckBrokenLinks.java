package needToBeAutomated;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBrokenLinks {
	public WebDriver driver ; 

	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.navigate().to("http://room5.trivago.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void showMeBrokenLinks() 
	{
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("The Total no. of links are equal: "+ links.size());
		for (int i = 0 ; i < links.size() ; i++ ) 
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href"); 
			VerifyLink(url);
		}
	}
	public static void VerifyLink(String urlLink) 
	{
		try {
			URL link = new URL(urlLink);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();

			if(httpConn.getResponseCode() == 200 || httpConn.getResponseCode() == 202) 
			{
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
			else  {
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}


}
