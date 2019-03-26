package com.flexon.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 
		   
		  @Test
	       public void Appsum()
	       { 
			System.out.println("sum");
	        int x = 15;
	        int y = 15;
	        
	        
	        int expResult = 30;
	        int result = App.sum(x, y);
	        assertEquals(expResult, result);

	        assertEquals(15, App.sum(15, 0));

	        assertEquals(15, App.sum(0, 15));

	        assertEquals(0, App.sum(0, 0));
	        
	       }
}
