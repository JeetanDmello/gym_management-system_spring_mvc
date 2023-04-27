package net.project.gms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.gms.service.userService;
import net.project.gms.entity.user;
import net.project.gms.entity.equipment;
import net.project.gms.entity.trainer;
import net.project.gms.entity.payment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import net.project.gms.decorator.*;

@Controller
public class userController {
	private userService user_service;

	public userController(userService user_service) {
		super();
		this.user_service = user_service;
	}
	
	//----------------------------------------------------------------
	@GetMapping("/users/home")
	public String listPrograms(Model model) {
		List<Program> programs = new ArrayList<>();
		programs.add(new CardioProgram());
		programs.add(new YogaProgram());
		programs.add(new StrengthTrainingProgram());
		programs.add(new PersonalTrainingDecorator(new StrengthTrainingProgram()));
		programs.add(new PersonalTrainingDecorator(new YogaProgram()));
		
		// Wrap the programs with decorators as needed
		
		model.addAttribute("programs", programs);
		return "user/home";
	}
	
	@GetMapping("/users/profile")
	public String profile(Model model) {
		Long id = 19l;
		model.addAttribute("users", user_service.getUserByID(id));
		return "user/profile";
	}
	
	@GetMapping("/users/profile/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("users", user_service.getUserByID(id));
		return "user/editProfile";
	}
	
	@PostMapping("/users/profile/{id}")
	public String updateuser(@PathVariable Long id,
			@ModelAttribute("users") user User,
			Model model) throws ParseException {
		
		// get user from database by id
		user existinguser = user_service.getUserByID(id);
		
		existinguser.setUser_id(id);
		
		existinguser.setName(User.getName());
		
		existinguser.setPassword(User.getPassword());
		
		existinguser.setPhone_no(User.getPhone_no());
		
		existinguser.setAddress(User.getAddress());
		
		existinguser.setAge(User.getAge());
		
		existinguser.setGender(User.getGender());
		 
		// save updated user object
		user_service.updateUser(existinguser);
		return "redirect:/users/profile";		
	}

	//-----------------------------------------------------------------------
	private String Payment_method;
	
	
	@GetMapping("/users/payments")
	public String createPaymentForm(Model model) {
		// Create payment object to hold user form data
		payment Payment= new payment();
		model.addAttribute("payments", Payment);
		return "user/payment";
	}
	
	@PostMapping("/users/payments")
	public String insertPayment(@ModelAttribute("payments") payment Payment) {
		Payment_method = payment.payment_method; 
		user_service.insertPayment(Payment);
		return "redirect:/users/payments/result";
	}
	
	@GetMapping("/users/payments/result")
	public String paymentResult(Model model) {
		// Create payment object to hold user form data
		payment Payment= new payment();
		model.addAttribute("payments", Payment);
		return "user/result";
	}
}
