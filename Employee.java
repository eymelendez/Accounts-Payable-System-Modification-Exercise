/**
 *  Filename: Employee.java
 * 
 * Author: Edwin Y. Melendez Lopez #89139
 * 
 * Description: Java Program that uses abstract methods or classes to be extended to sub classes. 
 * 				Basically father classes extending the parameters to the concrete classes which are the subclasses.
 *  
 * 			History:
 * 			01/27/2018 - Created Program. EML
 *  		01/27/2018 - Created Class Employee. EML
 * 			01/27/2018 - Created Setters and getters. EML
 * 			01/27/2018 - Created toString() for Employee. EML
 * 			01/27/2018 - Fixed some errors. EML
 * 
 * 			01/27/2018 - Created Class SalariedEmployee. EML
 * 			01/27/2018 - Created Setters and getters. EML
 * 			01/27/2018 - Created toString() for SalariedEmployee. EML
 * 
 *   		01/28/2018 - Created Class HourlyEmployee. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for HourlyEmployee. EML
 * 
 *  		01/28/2018 - Created Class CommissionEmployee. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for CommissionEmployee. EML
 * 
 *  		01/28/2018 - Created Class BasePlusCommissionEmployee. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for BasePlusCommissionEmployee. EML
 * 
 * 			01/28/2018 - Created Main PayrollSystemTest. EML
 * 
 * 			01/28/2018 - Added "implements Payable" to the abstract class Employee. EML
 * 			01/28/2018 - Added Some Throw new exceptions. EML
 * 			01/28/2018 - Began tests. EML
 * 			01/29/2018 - Fixing Issues. EML
 * 			01/29/2018 - Exception handling triggered, making adjustments. EML
 * 			01/30/2018 - Tested Program and documentation complete. EML
 * 			01/30/2018 - Documentation double-checked and ready for submit. EML
 */

// Fig. 10.4: Employee.java
// Employee abstract superclass

package edu.pupr.Employee;

import java.util.*;

public abstract class Employee implements Payable
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// Constructor with three parameters
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		// super(); 
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}

	/**
	 * 
	 * @return returns first name.
	 */
	public String getFirstName() 
	{
		return firstName;
	}

	/**
	 * 
	 * @return returns last name.
	 */
	
	public String getLastName() 
	{
		return lastName;
	}

	/**
	 * 
	 * @return returns the social security number
	 */
	public String getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	
	// return String representation of Employee Object:
	@Override
	public String toString() 
	{
		return String.format("%s %s%nSocial Security Number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	// Abstract Method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
	
	// After passing the Fig. 10.13
	
	// NOTE: We do not implement Payable method getPaymentAmount here so
	// this class must be declared abstract to avoid a compilation error.
	
	
} // end abstract class Employee



/*Output:

Employees processed individually:

Salaried employee: John Smith
Social Security Number: 111-11-1111
Weekly salary: $ 800.00
earned: $800.00

Hourly employee: Karen Price
Social Security Number: 222-22-2222
Hourly wage: $16.75; Hours worked:  40.00
earned: $670.00

Commission employee: Sue Jones
Social Security Number: 333-33-333
Gross sales: $10,000.00; Commission rate: 0.06
earned: $600.00

Base-salaried Commission employee: Bob Lewis
Social Security Number: 444-44-4444
Gross sales: $5,000.00; Commission rate: 0.04; Base salary: $300.00
earned: $500.00

Employees processed polymorphically using the payable:%n%n

Hourly employee: Mike Wazowski
Social Security Number: 111-11-1111
Hourly wage: $15.25; Hours worked:  40.00 
Payment due: $0.00

Salaried employee: John Cena
Social Security Number: 222-22-2222
Weekly salary: $ 1,500.00 
Payment due: $0.00

Commission employee: That Boii
Social Security Number: 333-33-3333
Gross sales: $5,000.00; Commission rate: 0.11 
Payment due: $0.00

Base-salaried Commission employee: Douno DWai
Social Security Number: 777-77-7777
Gross sales: $10,000.00; Commission rate: 0.23; Base salary: $5,000.00 
Payment due: $0.00
*/