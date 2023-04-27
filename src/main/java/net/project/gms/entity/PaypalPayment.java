package net.project.gms.entity;

public class PaypalPayment implements PaymentMethod{
	public String processPayment(Float amount) {
		return "Payment done through Paypal";
	}
}
