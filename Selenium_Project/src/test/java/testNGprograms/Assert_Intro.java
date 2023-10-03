package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_Intro {
  @Test
  public void f() {
	  String actualresult = "Welcome";
	  String expectedresult = "Welcome";
	  Assert.assertEquals(actualresult, expectedresult);
  }
  
  @Test
  public void h() {
  boolean eg1 =true;
  Assert.assertTrue(eg1);
  
  //true  --- pass
  //false --- fail
  
  }
  
}
