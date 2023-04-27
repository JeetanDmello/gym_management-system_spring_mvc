package net.project.gms.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.gms.decorator.CardioProgram;
import net.project.gms.decorator.PersonalTrainingDecorator;
import net.project.gms.decorator.Program;
import net.project.gms.decorator.StrengthTrainingProgram;
import net.project.gms.decorator.YogaProgram;
import net.project.gms.entity.trainer;
import net.project.gms.entity.user;
import net.project.gms.service.trainerService;

@Controller
public class trainerController {
	public trainerService trainer_service;

	public trainerController(trainerService trainer_service) {
		super();
		this.trainer_service = trainer_service;
	}
	
	//------------------------------------------------------------
	@GetMapping("/trainers/home")
	public String home(Model model) {
		
		return "trainer/home";
	}
	
	@GetMapping("/trainers/profile")
	public String profile(Model model) {
		Long id = 1l;
		model.addAttribute("trainers", trainer_service.getTrainerByID(id));
		return "trainer/profile";
	}
	
	@GetMapping("/trainers/profile/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("trainers", trainer_service.getTrainerByID(id));
		return "trainer/editProfile";
	}
	
	@PostMapping("/trainers/profile/{id}")
	public String updateuser(@PathVariable Long id,
			@ModelAttribute("trainers") trainer Trainer,
			Model model) throws ParseException {
		
		// get user from database by id
		trainer existinguser = trainer_service.getTrainerByID(id);
		
		existinguser.setTrainer_id(id);
		
		existinguser.setName(Trainer.getName());
		
		existinguser.setPassword(Trainer.getPassword());
		
		existinguser.setPhone_no(Trainer.getPhone_no());
		
		existinguser.setAddress(Trainer.getAddress());
		
		existinguser.setAge(Trainer.getAge());
		
		existinguser.setGender(Trainer.getGender());
		 
		// save updated user object
		trainer_service.updateTrainer(existinguser);
		return "redirect:/trainers/profile";		
	}
}
