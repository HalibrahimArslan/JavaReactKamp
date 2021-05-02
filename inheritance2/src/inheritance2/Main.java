package inheritance2;

public class Main {
	//Birbirinin alternatifi olan kodlar if ile kodlanmaz
	public static void main(String[] args) {
		CustomerManager customer=new CustomerManager();
		customer.add(new FileLogger());

	}

}
