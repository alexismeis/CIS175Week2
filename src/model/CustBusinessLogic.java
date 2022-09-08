package model;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class CustBusinessLogic {
	
	public boolean qualifySeniorDiscount(Customer customer) {
		if (customer.getAge() >= 60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateCoupon(Customer customer) {
		double coupon = 0;
		
		
		if(customer.getTotalYearlySpent() < 200) {
			coupon = 0;
		} 
		else {
			coupon = 20;
		}
		
		return coupon;
	}
	
	public double calculateMonthlySpent(Customer customer) {
		double monthlySpent = 0;
		monthlySpent = customer.getTotalYearlySpent() / 12;
		return monthlySpent;
	}

}
