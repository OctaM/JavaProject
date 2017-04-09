package ro.unitbv.invoicemanagement.model;

import java.util.ArrayList;
import java.util.List;

public class OrdinaryUser extends User {
	
	private List<Invoice> invoiceList;
	
	public OrdinaryUser(String usUsername, String usPassword) {
		super(usUsername, usPassword);
		invoiceList = new ArrayList<>();
	}

	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}

	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

}
