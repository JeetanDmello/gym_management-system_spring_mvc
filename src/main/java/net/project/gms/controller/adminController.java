package net.project.gms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.gms.service.adminService;
import net.project.gms.entity.user;
import net.project.gms.entity.equipment;
import net.project.gms.entity.trainer;
import net.project.gms.entity.payment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class adminController {
	private adminService admin_service;

	public adminController(adminService admin_service) {
		super();
		this.admin_service = admin_service;
	}
	
	//-----------------------------------------------------------------------------------------
	//handler method to handle list users request and return handle and view
	@GetMapping("/admin/users")
	public String listUsers(Model model) {
		model.addAttribute("users", admin_service.getAllUsers());
		return "admin/adminViewUsers";
	}
	
	@GetMapping("/admin/users/new")
	public String createUserForm(Model model) {
		
		// Create user object to hold user form data
		user User = new user();
		
		model.addAttribute("users", User);
		return "admin/adminInsertUsers";
	}
	
	@PostMapping("/admin/users")
	public String insertUser(@ModelAttribute("users") user User) {
		admin_service.insertUser(User);
		return "redirect:/admin/users";
	}
	
	@GetMapping("/admin/users/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("users", admin_service.getUserByID(id));
		return "admin/adminEditUser";
	}
	
	@PostMapping("/admin/users/{id}")
	public String updateuser(@PathVariable Long id,
			@ModelAttribute("users") user User,
			Model model) throws ParseException {
		
		// get user from database by id
		user existinguser = admin_service.getUserByID(id);
		
		existinguser.setUser_id(id);
		
		existinguser.setName(User.getName());
		
		existinguser.setPassword(User.getPassword());
		
		existinguser.setPhone_no(User.getPhone_no());
		
		existinguser.setAddress(User.getAddress());
		
		existinguser.setAge(User.getAge());
		
		existinguser.setGender(User.getGender());
		 
		existinguser.setJoin_date(User.getJoin_date());
		
		existinguser.setMember_status(User.getMember_status());
	
		existinguser.setDuration(User.getDuration());
		int duration = User.getDuration();
		String join_date = User.getJoin_date();
		String membership_end_date = User.getMembership_end_date();
		if(duration > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
			Calendar cal = Calendar.getInstance();  
	        try{  
	           cal.setTime(sdf.parse(join_date));  
	        }catch(ParseException e){  
	            e.printStackTrace();  
	         }  
	        cal.add(Calendar.MONTH, duration);  
	        membership_end_date = sdf.format(cal.getTime());  
		}
		existinguser.setMembership_end_date(User.getMembership_end_date());
		
		
		// save updated user object
		admin_service.updateUser(existinguser);
		return "redirect:/admin/users";		
	}
	
	@GetMapping("/admin/users/{id}")
	public String deleteUser(@PathVariable Long id) {
		admin_service.deleteUserById(id);
		return "redirect:/admin/users";
	}
	
	//-------------------------------------------------------------------------------------
	//For Trainers
	@GetMapping("/admin/trainers")
	public String listTrainers(Model model) {
		model.addAttribute("trainers", admin_service.getAllTrainers());
		return "admin/adminViewTrainer";
	}
	
	@GetMapping("/admin/trainers/new")
	public String createTrainerForm(Model model) {
		// Create trainer object to hold user form data
		trainer Trainer = new trainer();
		
		model.addAttribute("trainers", Trainer);
		return "admin/adminInsertTrainer";
	}
	
	@PostMapping("/admin/trainers")
	public String insertTrianer(@ModelAttribute("trainers") trainer Trainer) {
		admin_service.insertTrainer(Trainer);
		return "redirect:/admin/trainers";
	}
	
	@GetMapping("/admin/trainers/edit/{id}")
	public String editTrainerForm(@PathVariable Long id, Model model) {
		model.addAttribute("trainers", admin_service.getTrainerByID(id));
		return "admin/adminEditTrainer";
	}
	
	@PostMapping("/admin/trainers/{id}")
	public String updatetainer(@PathVariable Long id,
			@ModelAttribute("users") trainer Trainer,
			Model model) throws ParseException {
		
		// get user from database by id
		trainer existingtrainer = admin_service.getTrainerByID(id);
		
		existingtrainer.setTrainer_id(id);
		
		existingtrainer.setName(Trainer.getName());
		
		existingtrainer.setPassword(Trainer.getPassword());
		
		existingtrainer.setPhone_no(Trainer.getPhone_no());
		
		existingtrainer.setAddress(Trainer.getAddress());
		
		existingtrainer.setAge(Trainer.getAge());
		
		existingtrainer.setGender(Trainer.getGender());
		
		existingtrainer.setWorking_hours(Trainer.getWorking_hours());
		
		existingtrainer.setSalary(Trainer.getSalary());
		
		
		// save updated user object
		admin_service.updateTrainer(existingtrainer);
		return "redirect:/admin/trainers";		
	}
	
	@GetMapping("/admin/trainers/{id}")
	public String deleteTrainer(@PathVariable Long id) {
		admin_service.deleteTrainerById(id);
		return "redirect:/admin/trainers";
	}
	
	//-------------------------------------------------------------------------------------
	//For Equipments
	@GetMapping("/admin/equipments")
	public String listEquipment(Model model) {
		model.addAttribute("equipments", admin_service.getAllEquipment());
		return "admin/adminViewEquipment";
	}
	
	@GetMapping("/admin/equipments/new")
	public String createEquipmentForm(Model model) {
		// Create equipment object to hold user form data
		equipment Equipment= new equipment();
		
		model.addAttribute("equipments", Equipment);
		return "admin/adminInsertEquipment";
	}
	
	@PostMapping("/admin/equipments")
	public String insertEquipment(@ModelAttribute("equipments") equipment Equipment) {
		admin_service.insertEquipment(Equipment);
		return "redirect:/admin/equipments";
	}
	
	@GetMapping("/admin/equipments/edit/{id}")
	public String editEquipmentForm(@PathVariable Long id, Model model) {
		model.addAttribute("equipments", admin_service.getEquipmentByID(id));
		return "admin/adminEditEquipment";
	}
	
	@PostMapping("/admin/equipments/{id}")
	public String updatetainer(@PathVariable Long id,
			@ModelAttribute("users") equipment Equipment,
			Model model) throws ParseException {
		
		// get user from database by id
		equipment existingequipment = admin_service.getEquipmentByID(id);
		
		existingequipment.setEquipment_id(id);
		
		existingequipment.setName(Equipment.getName());
		
		existingequipment.setMake_model(Equipment.getMake_model());
		
		existingequipment.setInfo(Equipment.getInfo());
		
		existingequipment.setPrice(Equipment.getPrice());
		
		existingequipment.setPurchase_date(Equipment.getPurchase_date());		
		
		// save updated user object
		admin_service.updateEquipment(existingequipment);
		return "redirect:/admin/equipments";		
	}
	
	@GetMapping("/admin/equipments/{id}")
	public String deleteEquipment(@PathVariable Long id) {
		admin_service.deleteEquipmentById(id);
		return "redirect:/admin/equipments";
	}
	
	//----------------------------------------------------------------------------
	//For payments
		@GetMapping("/admin/payments")
		public String listPayment(Model model) {
			model.addAttribute("payments", admin_service.getAllPayment());
			return "admin/adminViewPayment";
		}
		
		@GetMapping("/admin/payments/new")
		public String createPaymentForm(Model model) {
			// Create payment object to hold user form data
			payment Payment= new payment();
			
			model.addAttribute("payments", Payment);
			return "admin/adminInsertPayment";
		}
		
		@PostMapping("/admin/payments")
		public String insertPayment(@ModelAttribute("payments") payment Payment) {
			admin_service.insertPayment(Payment);
			return "redirect:/admin/payments";
		}
		
		@GetMapping("/admin/payments/edit/{id}")
		public String editPaymentForm(@PathVariable Long id, Model model) {
			model.addAttribute("payments", admin_service.getPaymentByID(id));
			return "admin/adminEditPayment";
		}
		
		@PostMapping("/admin/payments/{id}")
		public String updatetainer(@PathVariable Long id,
				@ModelAttribute("users") payment Payment,
				Model model) throws ParseException {
			
			// get user from database by id
			payment existingpayment = admin_service.getPaymentByID(id);
			
			existingpayment.setPayment_id(id);
			
			existingpayment.setUserid(Payment.getUserid());
			
			existingpayment.setType(Payment.getType());
			
			existingpayment.setAmount(Payment.getAmount());
			
			existingpayment.setDate(Payment.getDate());	
			
			// save updated user object
			admin_service.updatePayment(existingpayment);
			return "redirect:/admin/payments";		
		}
		
		@GetMapping("/admin/payments/{id}")
		public String deletePayment(@PathVariable Long id) {
			admin_service.deletePaymentById(id);
			return "redirect:/admin/payments";
		}
}
