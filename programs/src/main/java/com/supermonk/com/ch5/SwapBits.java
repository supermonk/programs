/**
 * 
 */
package com.supermonk.com.ch5;

/**
 * 	SwapBits.java
 *	Created on Jun 19, 2016, 6:00:05 AM with @version 1.0
 *	@author narendrabidari
 * 	Given a number x and two positions (from right side) in binary representation of x, 
 * 	write a function that swaps n bits at given two positions and returns the result. 
 * 	It is also given that the two sets of bits do not overlap.
 */
/**
 * @author narendrabidari
 *
 */
public class SwapBits {

	public static int swapBits(int element, int i, int j) {
		int first = element >> i & 1;
//		System.out.println(Integer.toBinaryString(first));
		int sencond = element >> j & 1;
//		System.out.println(Integer.toBinaryString(sencond));
//		System.out.println(Integer.toBinaryString(~(1 << i)));
//		System.out.println(Integer.toBinaryString(~(1 << j)));
//		System.out.println(Integer.toBinaryString(element));
//		System.out.println(Integer.toBinaryString(element & ~(1 << i)));
		element = element & ~(1 << i) & ~(1 << j);
//		System.out.println(Integer.toBinaryString(element));
		element = element | (first << j) | (sencond << i);
//		System.out.println(Integer.toBinaryString(element));
		
		// or do directly xor
		return element;
	}

	public static int swapBits1(int element, int i, int j) {
		other(element, i, j);
		System.out.println(Integer.toBinaryString(1));

		System.out.println(Integer.toBinaryString(element & (Integer.MAX_VALUE ^ (int) Math.pow(2, i))));
		// System.out.println(Integer.toBinaryString((element & (~(int)
		// Math.pow(2, i))) >> i) + " "+Integer.toBinaryString((element &
		// (~(int) Math.pow(2, j))) >> j));
		System.out.println(~1);
		if (element == 0)
			return 0;
		if ((element & (~(int) Math.pow(2, i))) >> i == (element & (~(int) Math.pow(2, j))) >> j) {

		} else {

		}
		return -1;
	}

	/**
	 * @param element
	 * @param i
	 * @param j
	 */
	private static void call(int element, int i, int j) {
		// negation problem
		// if 10 is passed = 1010 , i=1, j=3
		System.out.println(Integer.toBinaryString((int) Math.pow(2, i))); // 10
		System.out.println(Integer.toBinaryString(~(int) Math.pow(2, i))); // 11111111111111111111101
		// (total
		// 32)
		System.out.println(Integer.toBinaryString(element & ~(int) Math.pow(2, i))); // 1000
		// ,
		// why
		// did
		// leading
		// one
		// come??
		// problem is representing the unsigned bit (that is not present for
		// positive numbers)
		// idea dont reach end

		System.out.println("------------");
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

	}

	/**
	 * @param element
	 * @param i
	 * @param j
	 */
	private static void other(int element, int i, int j) {
		// negation problem
		// if 10 is passed = 1010 , i=1, j=3
		System.out.println("------------");
		System.out.println(Integer.toBinaryString(element));
		System.out.println(Integer.toBinaryString((int) Math.pow(2, i))); // 10
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE ^ (int) Math.pow(2, i))); // 11111111111111111111101
		// (total
		// 32)
		System.out.println(Integer.toBinaryString(element & (Integer.MAX_VALUE ^ (int) Math.pow(2, i)))); // 1000
		// ,
		// why
		// did
		// leading
		// one
		// come??
		// problem is representing the unsigned bit (that is not present for
		// positive numbers)
		// idea dont reach end

		System.out.println("------------");
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

	}

}
