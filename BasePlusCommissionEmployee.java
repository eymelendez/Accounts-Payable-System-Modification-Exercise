package edu.pupr.Employee;

// Fig. 10.8: BasePlusCommissionEmployee.java
// Base PlusCommissionEmployee class extends CommissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee
{

	private double baseSalary; // base salary per week
	
	// constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate, double baseSalary)
	{
		// super class
		super(firstName, lastName, socialSecurityNumber,
				grossSales, commissionRate);
	
		if(baseSalary < 0.0) // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		// set the baseSalary
		
		this.baseSalary = baseSalary;
	}

	// set base salary
	public void setBaseSalary(double baseSalary) 
	{
		if(baseSalary < 0.0) // validation
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// returns baseSalary
	public double getBaseSalary() 
	{
		return baseSalary;
	}

	// calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}
	
	// formatting Override
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f",
				"Base-salaried", super.toString(), 
				"Base salary", getBaseSalary());
	}

} // end class BasePlusCommissionEmployee