package net.project.gms.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer")
public class trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainer_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password", nullable = true)
	private String password;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "phone_no")
	private String phone_no;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "working_hours")
	private Integer working_hours;
	
	@Column(name = "salary")
	private Long salary;
	
	public trainer() {
		
	}
	public trainer(String name, String password, String gender, Integer age,
			String phone_no, String address, Integer working_hours, Long salary) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.phone_no = phone_no;
		this.address = address;
		this.working_hours = working_hours;
		this.salary = salary;
	}

	public Long getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(Long trainer_id) {
		this.trainer_id = trainer_id;
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

	public Integer getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(Integer working_hours) {
		this.working_hours = working_hours;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}	
}
