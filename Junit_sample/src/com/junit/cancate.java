package com.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cancate {

	@Test
	void test() {
		
	Junit junit=new Junit();
	String result = junit.concatenate("vidya", "raj");
	assertEquals("vidyaraj", result);
}

}
