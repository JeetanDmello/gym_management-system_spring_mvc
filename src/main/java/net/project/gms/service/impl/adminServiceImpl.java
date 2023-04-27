package net.project.gms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.project.gms.entity.equipment;
import net.project.gms.entity.payment;
import net.project.gms.entity.trainer;
import net.project.gms.entity.user;
import net.project.gms.repository.equipmentRepository;
import net.project.gms.repository.paymentRepository;
import net.project.gms.repository.trainerRepository;
import net.project.gms.repository.userRepository;
import net.project.gms.service.adminService;

@Service
public class adminServiceImpl implements adminService{

	private userRepository user_repository;
	private trainerRepository trainer_repository;
	private equipmentRepository equipment_repository;
	private paymentRepository payment_repository;

	

	public adminServiceImpl(userRepository user_repository, trainerRepository trainer_repository,
			equipmentRepository equipment_repository, paymentRepository payment_repository) {
		super();
		this.user_repository = user_repository;
		this.trainer_repository = trainer_repository;
		this.equipment_repository = equipment_repository;
		this.payment_repository = payment_repository;
	}


	//------------------------------------------------------
	@Override
	public List<user> getAllUsers() {
		return user_repository.findAll();
	}
	

	@Override
	public user insertUser(user User) {
		return user_repository.save(User);
	}

	@Override
	public user getUserByID(Long user_id) {
		return user_repository.findById(user_id).get();
	}

	@Override
	public user updateUser(user User) {
		return user_repository.save(User);
	}

	@Override
	public void deleteUserById(Long id) {
		user_repository.deleteById(id);
		
	}

	//------------------------------------------------------
	@Override
	public List<trainer> getAllTrainers() {
		return trainer_repository.findAll();
	}

	@Override
	public trainer insertTrainer(trainer Trainer) {
		return trainer_repository.save(Trainer);
	}

	@Override
	public trainer getTrainerByID(Long trainer_id) {
		return trainer_repository.findById(trainer_id).get();
	}

	@Override
	public trainer updateTrainer(trainer Trainer) {
		return trainer_repository.save(Trainer);
	}

	@Override
	public void deleteTrainerById(Long id) {
		trainer_repository.deleteById(id);
	}

	//------------------------------------------------------
	@Override
	public List<equipment> getAllEquipment() {
		return equipment_repository.findAll();
	}


	@Override
	public equipment insertEquipment(equipment Equipment) {
		return equipment_repository.save(Equipment);
	}


	@Override
	public equipment getEquipmentByID(Long equipment_id) {
		return equipment_repository.findById(equipment_id).get();
	}


	@Override
	public equipment updateEquipment(equipment Equipment) {
		return equipment_repository.save(Equipment);
	}


	@Override
	public void deleteEquipmentById(Long id) {
		equipment_repository.deleteById(id);
		
	}
	
	//--------------------------------------------------------

	@Override
	public List<payment> getAllPayment() {
		return payment_repository.findAll();
	}

	@Override
	public payment insertPayment(payment Payment) {
		return payment_repository.save(Payment);
	}

	@Override
	public payment getPaymentByID(Long payment_id) {
		return payment_repository.findById(payment_id).get();
	}

	@Override
	public payment updatePayment(payment Payment) {
		return payment_repository.save(Payment);
	}

	@Override
	public void deletePaymentById(Long id) {
		payment_repository.deleteById(id);
		
	}
}
