package TestNGDemo;

import org.testng.annotations.Test;

public class groups {
  @Test(groups="odd")
  public void one() {
	  System.out.println("odd");
  }
  
  @Test(groups="even")
  public void two() {
	  System.out.println("even");
  }
  @Test(groups="odd")
  public void three() {
	  System.out.println("odd");
  }
  
  @Test(groups="even")
  public void four() {
	  System.out.println("even");
  }
  @Test(groups="odd")
  public void five() {
	  System.out.println("odd");
  }
  
}
