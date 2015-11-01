package PageTests;

import org.junit.Test;

import PageObjects.App;


public class AppTest
{
   
   @Test
   public void testSite(){
	   App a=new App();
	   a.openSite();	   
   }
   
}
