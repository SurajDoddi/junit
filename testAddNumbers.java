package junitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		junitFunctions junit = new junitFunctions();
		Number result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	   }
	}
