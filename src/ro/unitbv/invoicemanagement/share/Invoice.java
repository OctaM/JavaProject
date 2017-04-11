package ro.unitbv.invoicemanagement.share;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {
	private int discount;
	private Status status;
	private float pret;
	private List<Product> productList;
	private LocalDateTime date;

	public Invoice(int iDiscount, Status iStatus, float iPret, List<Product> iProductList) {
		discount = iDiscount;
		status = iStatus;
		pret = iPret;
		productList = iProductList;
		date = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Invoice [discount=" + discount + ", status=" + status + ", pret=" + pret + ", productList="
				+ productList + ", date=" + date + "]";
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
