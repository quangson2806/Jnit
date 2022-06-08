package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTesting {

	@Test
	void isMaxAtFinalPosition() {
		//is the max element at final position 
		int arr[] = {6,3,7,2,9};
		Max test = new Max();
		int output = test.max(arr);
		assertEquals(9, output);
	}

   @Test
	void isMaxAtFirstPosition() {
	   // is the max element at first position
		int arr[] = {9,6,3,7,2};
		Max test = new Max();
		int output = test.max(arr);
		assertEquals(9, output);
	}

  @Test
	void isMaxAtAnyPosition() {
	  // is the max element at any position
		int arr[] = {6,9,3,7,2};
		Max test = new Max();
		int output = test.max(arr);
		assertEquals(9, output);
	}

}
