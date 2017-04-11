package ro.unitbv.invoicemanagement.share;

public class Administrator2 extends User implements Admin{

	private static Administrator2 singleton = new Administrator2("Admin2", "Admin2");
	
	private Administrator2(String usUsername, String usPassword) {
		super(usUsername, usPassword);
		// TODO Auto-generated constructor stub
	}
	
	public static Administrator2 getInstance() {
		return singleton;
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deny() {
		// TODO Auto-generated method stub
		
	}

}
