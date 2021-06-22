package firstPackage;

import org.testng.annotations.Test;

public class Firsttestng
{
	@Test
	public void firsttestase()
	{
		System.out.println("hello, this is my first test case");
		org.testng.Assert.assertEquals(5, 5);
	}

}
