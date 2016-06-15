/**
 * 
 */
package com.supermonk.com.ch5;

/**
* 	ComputeParity.java
*	Created on Jun 15, 2016, 8:51:01 AM with @version 1.0
*	@author narendrabidari
* 	Compute the Parity of the Number.
*   Parity of a number refers to whether it contains an odd or even number of 1-bits. 
*   The number has “odd parity”, if it contains odd number of 1-bits and is “even parity” 
*   if it contains even number of 1-bits
*/
/**
 * @author narendrabidari
 *
 */
public class ComputeParity {
	
	public static boolean findParity(int num){
		
		// or use a single variable using xor.
		
		boolean parity = false;
		int parityCount = 0;
		if(num == 0)
			return true;
		if(num<0)
			return findParity(-1 * num);
		while(num>0){
			parityCount= parityCount + ((num>>1 ) & 1);
			System.out.println(parityCount + " :: " + num);
			num = num>>1;
		}
		
		
		parity = (parityCount%2 ==0);
		System.out.println("Finish " + parityCount);
		return parity;
	}

}
