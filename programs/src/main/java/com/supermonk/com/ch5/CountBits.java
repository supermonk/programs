/**
 * 
 */
package com.supermonk.com.ch5;
/**
* 	CountBits.java
*	Created on Jun 5, 2016, 9:36:41 AM with @version 1.0
*	@author narendrabidari
* 	Add description of file
*/
/**
 * @author narendrabidari
 *
 */
public class CountBits {
	
	public static int countBits(int x){
		int count =0 ;
		while(x!=0){
			count+=(x&1);
			x>>=1;
		}
		return count;
	}

}
