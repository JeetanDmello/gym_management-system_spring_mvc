package net.project.gms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipment")
public class equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long equipment_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "make_model")
	private String make_model;
	
	@Column(name = "info")
	private String info;
	
	@Column(name = "price")
	private Float price;
	
	@Column(name = "purchase_date")
	private String purchase_date;

	public equipment() {
		
	}
	
	public equipment(String name, String make_model, String info, Float price, String purchase_date) {
		super();
		this.name = name;
		this.make_model = make_model;
		this.info = info;
		this.price = price;
		this.purchase_date = purchase_date;
	}

	public Long getEquipment_id() {
		return equipment_id;
	}

	public void setEquipment_id(Long equipment_id) {
		this.equipment_id = equipment_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake_model() {
		return make_model;
	}

	public void setMake_model(String make_model) {
		this.make_model = make_model;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
}
