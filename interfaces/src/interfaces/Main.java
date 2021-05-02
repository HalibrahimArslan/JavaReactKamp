package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new EmailLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		
		Customer halil=new Customer(1,"Halil","Arslan");
		
		customerManager.add(halil);

	}

}
