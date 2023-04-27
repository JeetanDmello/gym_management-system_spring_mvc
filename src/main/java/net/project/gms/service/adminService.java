package net.project.gms.service;

import java.util.List;

import net.project.gms.entity.equipment;
import net.project.gms.entity.payment;
import net.project.gms.entity.trainer;
import net.project.gms.entity.user;

public interface adminService {
	//---------------------------------------------
	List<user> getAllUsers();
	
	user insertUser(user User);
	
	user getUserByID(Long user_id);
	
	user updateUser(user User);

	void deleteUserById(Long id);
	
	//---------------------------------------------
	List<trainer> getAllTrainers();
	
	trainer insertTrainer(trainer Trainer);
	
	trainer getTrainerByID(Long trainer_id);
	
	trainer updateTrainer(trainer Trainer);

	void deleteTrainerById(Long id);
	
	//---------------------------------------------
	List<equipment> getAllEquipment();
	
	equipment insertEquipment(equipment Equipment);
	
	equipment getEquipmentByID(Long equipment_id);
	
	equipment updateEquipment(equipment Equipment);

	void deleteEquipmentById(Long id);
	
	//---------------------------------------------
	List<payment> getAllPayment();
	
	payment insertPayment(payment Payment);
	
	payment getPaymentByID(Long payment_id);
	
	payment updatePayment(payment Payment);

	void deletePaymentById(Long id);
	
	//---------------------------------------------
	
}
