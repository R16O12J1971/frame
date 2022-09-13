package org.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestingSample {
	@Test
	private void tc0() {
		System.out.println("tc0");
	}
	
   @BeforeSuite 
	private void tc1() {
		System.out.println("tc1");
	}
	@BeforeClass
	private void tc2() {
		System.out.println("tc2");
	}
	
	private void tc3() {
		System.out.println("tc3");
	}
	
	private void tc4() {
		System.out.println("tc4");
	}
}
