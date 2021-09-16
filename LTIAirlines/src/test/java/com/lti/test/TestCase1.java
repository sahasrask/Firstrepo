package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		
		int num1=10,num2=10;
		assertEquals(20, Main.add(num1, num2));
	}
	
	@Test
	public void testNums()
	{
		int num1=10,num2=30;
//		assertTrue(Main.compare(num1, num2));
		assertFalse(Main.compare(num1, num2));
	}
	
	

	

}
