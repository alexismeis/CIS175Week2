package model;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Sep 7, 2022
 */
public class Customer {

	// instance variables
	private String name;
	private int age;
	private double totalYearlySpent;
	
	// default no-arg constructor
	public Customer() {
		
	}

	// non default constructor
	public Customer(String name) {
		this.name = name;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotalYearlySpent() {
		return totalYearlySpent;
	}

	public void setTotalYearlySpent(double totalSpent) {
		this.totalYearlySpent = totalSpent;
	}
	
	
}
