package secondPackage;

import org.testng.annotations.Test;

public class secondtestng 
{
		String expectedvalue = "india";
		String actualvalue = "punjab";
			@Test(priority = 2)
	public void testng() 
	{		
		System.out.println(expectedvalue);
		System.out.println(actualvalue);
		org.testng.Assert.assertNotEquals(expectedvalue, actualvalue);
			
	}
			int a = 10;
			int b = 10;
			@Test(priority = 1)
			public void testng1() 
			{		
				System.out.println(a);
				System.out.println(b);
				org.testng.Assert.assertEquals(a,b);
					
			}

}



