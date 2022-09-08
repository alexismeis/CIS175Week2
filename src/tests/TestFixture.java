package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class TestFixture {
	protected int value1, value2;
	
	@Before
	public void setUp() throws Exception {
		
		value1 = 5;
		value2= 6;
	}

	@Test
	public void test() {
		double result = value1 + value2;
		assertTrue(result == 11);
	}

}
