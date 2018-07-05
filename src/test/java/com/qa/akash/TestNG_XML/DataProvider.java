package com.qa.akash.TestNG_XML;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider = "NameProvider", dataProviderClass = DataProviderClass.class)
	public void Test01(String firstname, String lastname) throws InterruptedException
	{
		System.out.println("Hello "+firstname+" "+lastname);
	}

}
