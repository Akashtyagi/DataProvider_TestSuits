package com.qa.akash.TestNG_XML;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="NameProvider")
	public static Object[][] getData_from_DataProvider()
	{
		return new Object[][]
				{
					{ "Akash", "Tyagi" },
					{ "Jaykant", "Sheekre" },
					{ "Singham", ""}
				};
	}

}
 