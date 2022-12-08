package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericScripts.Base_class;
import GenericScripts.Excel;
import POMScripts.POM;

public class TS_1 extends Base_class

{
	@Test
	public void script() throws Throwable 
	{
		String username=Excel.getdata("Sheet1", 0, 0);
		String password=Excel.getdata("Sheet1", 1, 0);
		
		  POM pmc = new POM(driver);
		
			pmc.email(username);
			pmc.passwd(password);
			Assert.fail();
			pmc.login();
		}
	}
	
	


