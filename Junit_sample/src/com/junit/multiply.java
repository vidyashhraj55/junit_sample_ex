package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiply {

	@Test
	void test() {
		Junit junit=new Junit();
		int result = junit.multiply(3,4);
		assertEquals(12, result);
	}

}