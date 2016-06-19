/**
 * 
 */
package com.supermonk.com.ch5;
/**
* 	FindClosestSame.java
*	Created on Jun 19, 2016, 7:41:32 AM with @version 1.0
*	@author narendrabidari
* 	Add description of file
*/
/**
 * @author narendrabidari
 *
 */
public class FindClosestSame {
	
	public static int closest(int val){
		if(val ==0 || val == Integer.MAX_VALUE)
			return -1;
		int i=0;
		while(((1&(val>>i))==(1&(val>>(i+1))))){
			i++;
		}
		val = val ^ (1<<i | 1<<i+1);
		return val;
	}

}
