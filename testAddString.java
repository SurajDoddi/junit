package junitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		//fail("Not yet implemented");
		junitFunctions junit = new junitFunctions();
		String result = junit.addstrings("Majjari", "Gowtham");
		assertEquals("MajjariGowtham",result);
	}
	}
