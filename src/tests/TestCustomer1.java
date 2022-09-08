package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CustBusinessLogic;
import model.Customer;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class TestCustomer1 {
	CustBusinessLogic custBL = new CustBusinessLogic();
	Customer customer = new Customer("Alexis");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQualifiesSeniorDiscount() {
		customer.setAge(60);
		assertTrue(custBL.qualifySeniorDiscount(customer));
	}
	
	@Test
	public void testDoesNotQualifySeniorDiscount() {
		customer.setAge(55);
		assertFalse(custBL.qualifySeniorDiscount(customer));
	}

}
