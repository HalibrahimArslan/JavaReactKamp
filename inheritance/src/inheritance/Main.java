package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer halil=new IndividualCustomer();
		halil.id=1;
		halil.firstName="Halil";
		halil.lastName="Arslan";
		halil.customerNumber="1345";
		halil.nationalIdentitiy="1243142354";
		
		
		CorporateCustomer halkbank=new CorporateCustomer();
		halkbank.id=1;
		halkbank.customerNumber="124124";
		halkbank.companyName="halkbank";
		halkbank.taxNumber="32141242";
		
		
		SendikaCustomer sendika=new SendikaCustomer();
		sendika.customerNumber="45645";
		
		//polymorphism
		CustomerManager customerManager =new CustomerManager();
		Customer[] customers={halil,halkbank,sendika};
		customerManager.addMultiple(customers);
		
	}

}
