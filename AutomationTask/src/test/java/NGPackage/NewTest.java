package NGPackage;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest
{
 WebDriver driver;
  @Test
  public void stateSelectionAssam() throws InterruptedException 
  {
	
	  WebElement StateOne = driver.findElement(By.xpath("//select[@class='data-filter-input']"));
	  Thread.sleep(2000);
	  Select s = new Select(StateOne);
	  s.selectByIndex(3);
      String expected = "Assam";
	  
	  String  actual= driver.findElement(By.xpath("//option[@value='Assam']")).getText();
	  Assert.assertEquals(expected, actual,"selected state is not displayed");
			 
  }
  
  @BeforeClass
  public void beforeClass() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://inerg-test.web.app/");
	  driver.manage().window().maximize();	
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
  }

 // @AfterClass
//  public void afterClass() 
//  {
//		 driver.close();
//
//  }
  
  

}
