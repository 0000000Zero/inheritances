package inheritances;


public class CustomerManager {
	
	public void add (Customer customers) {
		System.out.println(customers + " Musteri Eklendi!");
	}
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer: customers) {
			 add(customer);
		}
	}

}
