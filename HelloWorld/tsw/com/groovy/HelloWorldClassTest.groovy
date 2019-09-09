package com.groovy

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class HelloWorldClassTest {
	
	private HelloWorldClass hwc;
	
	@BeforeEach
	public void initializeHelloWorldClass() {
		this.hwc = new HelloWorldClass();
	}

	@Test
	void testGetHelloWorldString() {
		String message = this.hwc.getHelloWorldString();
		
		assertEquals("Hello World in Groovy!", message);
	}

}
