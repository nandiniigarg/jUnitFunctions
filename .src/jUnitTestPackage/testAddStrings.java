package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		String result = JUnit.addstring("he","llo");
		assertEquals("hello",result);
	}

}
