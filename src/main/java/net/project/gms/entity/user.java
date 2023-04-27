package net.project.gms.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "password")
	private String password = "";
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "age", nullable = false)
	private Integer age;
	
	@Column(name = "join_date")
	private String join_date;
	
	@Column(name = "phone_no", nullable = false)
	private String phone_no;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "member_status", nullable = false)
	private Integer member_status;

	@Column(name = "membership_end_date")
	private String membership_end_date = LocalDate.now().toString();
	
	private Integer duration = 0;
	
	public user() {
		
	}
	
	public user(String name, String password, String gender, Integer age, String join_date, String phone_no,
			String address, Integer member_status, String membership_end_date) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.join_date = join_date;
		this.phone_no = phone_no;
		this.address = address;
		this.member_status = member_status;
		this.membership_end_date = membership_end_date;
	}
	
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMember_status() {
		return member_status;
	}

	public void setMember_status(Integer member_status) {
		this.member_status = member_status;
	}

	public String getMembership_end_date() {
		return membership_end_date;
	}

	public void setMembership_end_date(String membership_end_date) {
		this.membership_end_date = membership_end_date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}