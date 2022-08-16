package inheritances;

public class main {

	public static void main(String[] args)
	{
		IndividualCustomer bireysel = new IndividualCustomer();
		bireysel.customerNumber="101";
		
		CorporateCustomer kurumsal = new CorporateCustomer();
		kurumsal.customerNumber="202";
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber="303";
			
		CustomerManager cM = new CustomerManager();
		
		Customer[] customers =  {bireysel, kurumsal, sendika};
		
		cM.addMultiple(customers);
		

	}

}
