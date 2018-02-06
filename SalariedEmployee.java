package edu.pupr.Employee;

// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee

public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	// constructor with 4-parameters as arguments
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) 
	{
		super(firstName, lastName, socialSecurityNumber); // super class for hierarchy
		
		if(weeklySalary < 0.0)  // validate weeklySalary
		{
			throw new IllegalArgumentException("Weekly salary must be >= 0.0"); // validation exception.
		}
		
		this.weeklySalary = weeklySalary;
	}

	// set Salary
	public void setWeeklySalary(double weeklySalary) 
	{
		if(weeklySalary < 0.0) 
		{
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	}
	
	// return salary
	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() 
	{
		return getWeeklySalary();
	}
	
	// return String representation of SalariedEmployee object
	@Override
	public String toString() 
	{
		return String.format("Salaried employee: %s%n%s: $%, .2f", 
				super.toString(), "Weekly salary", getWeeklySalary());
	}

	// Override Abstract Method
	@Override
	public double getPaymentAmount() 
	{
		
		return 0;
	}
	
	
} // end class SalariedEmployee