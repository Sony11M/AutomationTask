package NGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationOne {
  @Test
  public void testcaseone() 
  {
	  System.out.println("one");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afte");
  }
  
  @Test
  public void testcasetwo() 
  {
	  System.out.println("two");
  }
}
