/**
 * 
 */
package com.supermonk.com.test.ch5;

import com.supermonk.com.ComputeParity;

import junit.framework.TestCase;

/**
* 	CountBits.java
*	Created on Jun 5, 2016, 9:38:40 AM with @version 1.0
*	@author narendrabidari
* 	Add description of file
*/
/**
 * @author narendrabidari
 *
 */
public class TestChp5 extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test(){
		for(int i=1;i<100;i=i*2){
//			System.out.println(com.supermonk.com.ch5.CountBits.countBits(i)+""+i);
			assertTrue(com.supermonk.com.ch5.CountBits.countBits(i)==1);
		}
		assertTrue(com.supermonk.com.ch5.CountBits.countBits(10)==2);
	}
	
	public void testComputeParity(){
		assertTrue(ComputeParity.findParity(0));
		assertFalse(ComputeParity.findParity(2));
		assertFalse(ComputeParity.findParity(4));
		
		assertTrue(ComputeParity.findParity(12));
		
	}

}
