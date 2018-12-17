import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	WebDriver d;
	
	
  @Test
  public void f() {
	  d.get("http://demoaut.com");
		 String Title= d.getTitle();
		 AssertJUnit.assertEquals(Title,"Welcome: Mercury Tours");
		 d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	  System.out.println("Hello");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Documents\\Selium 3.0\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	  
  }

  
}
