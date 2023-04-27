package net.project.gms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long payment_id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "userid")
	private Long userid;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "payment_method")
	public static String payment_method = "paypal";
	
	public payment() {
		
	}

	public payment(String type, Long userid, Float amount, String date, String payment_method) {
		super();
		this.type = type;
		this.userid = userid;
		this.amount = amount;
		this.date = date;
		this.payment_method = payment_method;
	}


	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getPaymentMethod() {
		if (payment_method.equals("creditcard")) {
			CreditcardPayment creditCard = new CreditcardPayment();
            return creditCard.processPayment(amount);
        } 
		else if (payment_method.equals("paypal")) {
			PaypalPayment paypal = new PaypalPayment();
            return paypal.processPayment(amount);
        }
        else {
        	PaypalPayment paypal = new PaypalPayment();
            return paypal.processPayment(amount);
        }
	}
	
}
