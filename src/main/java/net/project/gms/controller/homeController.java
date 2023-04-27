package net.project.gms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.gms.entity.user;
import net.project.gms.entity.userType;
import net.project.gms.service.adminService;
import net.project.gms.service.trainerService;
import net.project.gms.service.userService;

@Controller
public class homeController {
	private adminService admin_service;
	private userService user_service;
	private trainerService trainer_service;
	
	public homeController(adminService admin_service, userService user_service, trainerService trainer_service) {
		super();
		this.admin_service = admin_service;
		this.user_service = user_service;
		this.trainer_service = trainer_service;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		userType user_type = new userType();
		model.addAttribute("login", user_type);
		return "home/home";
	}
	
	@PostMapping("/")
	public String userType(@ModelAttribute("login") userType login) {
		String check = login.getType();
		return "redirect:/admin/{check}";
	}
	
}
