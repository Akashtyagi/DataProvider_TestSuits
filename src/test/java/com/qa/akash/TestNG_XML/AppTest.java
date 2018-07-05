package com.qa.akash.TestNG_XML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class AppTest 
{
	
	@Parameters({"greetings"})
	@Test
	public void Test01(String greetings) throws InterruptedException
	{
		System.out.println("This is Test 01 - " +greetings);
		System.out.println("Test 1 Thread ID "+ Thread.currentThread().getId());
	}
	
	@Test
	public void Test02()
	{
		System.out.println("This is Test 02 -");
		System.out.println("Test 2 Thread ID "+ Thread.currentThread().getId());
	}
    
	
//	Preserve test class execution order.
//	Parallel execution of test.
//	Parallel execution of methods.
//	Passing parameters in tests.
}
