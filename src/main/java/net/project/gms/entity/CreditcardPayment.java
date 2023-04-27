package net.project.gms.entity;

public class CreditcardPayment implements PaymentMethod {
	public String processPayment(Float amount) {
		
		return "Payment Done Through Credit-Card";
	}
}
