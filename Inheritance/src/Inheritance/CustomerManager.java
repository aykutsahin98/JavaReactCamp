package Inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}

	
	// Bulk Insert (çoklu ekleme)
	
	public void addMultiple(Customer [] customers) {
		
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
