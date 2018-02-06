package edu.pupr.Employee;

// Fig. 10.15 PayableInterfaceTest.java
// Payable interface test program processing Invoices and
// Employees polymorphically

public class PayableInterfaceTest 
{

	public static void main(String[] args) 
	{
		// create four-element Employee array
		Payable[] payableObjects = new Payable[4];
				
				
		// populate array with objects that implement Payable
		payableObjects[0] = new HourlyEmployee("Mike", "Wazowski", "111-11-1111", 3050.00 , 15.25, 40.00);
		payableObjects[1] = new SalariedEmployee("John", "Cena", "222-22-2222", 1500.00);
		payableObjects[2] = new CommissionEmployee("That", "Boii", "333-33-3333", 5000.00, 0.11);;
		payableObjects[3] = new BasePlusCommissionEmployee("Douno", "DWai", "777-77-7777", 10000.00, 0.23, 5000.00);;
				
		System.out.println("Employees processed polymorphically using the payable:%n%n");
		
		// generically process each element in array payableObjects
		for(Payable currentPayable : payableObjects)
		{
			System.out.printf("%n%s %n%s: $%,.2f%n",
					currentPayable.toString(), 
					"Payment due", currentPayable.getPaymentAmount());
		}

	} // end main
	

} // end class PayableInterfaceTest
