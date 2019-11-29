package cloudstore;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
  @Test
  public void f() {
	  
	  String sadhin="mahedi hasan";
	  Assert.assertTrue(sadhin.contains("hasan"), "sadhin does not contain hasan");
	  System.out.println("test");
  }
  
  @Test
  public void g() {
	  
	  String sadhin="mahedi hasan";
	  SoftAssert assertion=new SoftAssert();
	  assertion.assertTrue(sadhin.contains("hasan"), "sadhin does not contain hasan");
  }
}
