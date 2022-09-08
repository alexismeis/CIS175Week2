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
public class TestCustomer2 {
	CustBusinessLogic custBL2 = new CustBusinessLogic();
	Customer customer2 = new Customer("Margaret");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateCoupon() {
		customer2.setTotalYearlySpent(250);
		double coupon = custBL2.calculateCoupon(customer2);
		assertEquals(20, coupon, 0.0);
	}
	
	@Test
	public void testCalculateMonthlySpent() {
		customer2.setTotalYearlySpent(450);
		double monthlySpent = custBL2.calculateMonthlySpent(customer2);
		assertEquals(37.5, monthlySpent, 0.0);
	}

}
