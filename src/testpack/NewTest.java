package testpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(priority=1)
  public void f4() {
	  System.out.println("running test");
  }
  @Test(priority=4)
  public void f1() {
	  System.out.println("running test");
  }
  @Test(priority=2)
  public void f2() {
	  System.out.println("running test");
  }
  @Test(priority=3)
  public void f3() {
	  System.out.println("running test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before running test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after running test");
  }

}
