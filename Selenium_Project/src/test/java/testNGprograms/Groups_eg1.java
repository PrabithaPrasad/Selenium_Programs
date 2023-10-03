package testNGprograms;

import org.testng.annotations.Test;

public class Groups_eg1 
{
  @Test (priority =1, groups = {"regression"})
  public void register() 
  {
	  System.out.println("Test Methos register");
  }
  @Test (priority =2, groups = {"smoke", "regression"})
  public void login() 
  {
	  System.out.println("Test Methos login");
  }
  
  @Test (priority =3, groups = {"smoke", "regression"})
  public void add() 
  {
	  System.out.println("Test Methos add");
  }
	  @Test (priority =4, groups = {"regression"})
	  public void cancel() 
	  {
		  System.out.println("Test Methos cancel");
	  }
  }
