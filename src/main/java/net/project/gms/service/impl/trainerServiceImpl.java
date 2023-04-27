package net.project.gms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.project.gms.entity.program;
import net.project.gms.entity.trainer;
import net.project.gms.repository.equipmentRepository;
import net.project.gms.repository.paymentRepository;
import net.project.gms.repository.trainerRepository;
import net.project.gms.repository.userRepository;
import net.project.gms.service.trainerService;

@Service
public class trainerServiceImpl implements trainerService{
	private userRepository user_repository;
	private trainerRepository trainer_repository;
	private equipmentRepository equipment_repository;
	private paymentRepository payment_repository;
	
	public trainerServiceImpl(userRepository user_repository, trainerRepository trainer_repository,
			equipmentRepository equipment_repository, paymentRepository payment_repository) {
		super();
		this.user_repository = user_repository;
		this.trainer_repository = trainer_repository;
		this.equipment_repository = equipment_repository;
		this.payment_repository = payment_repository;
	}
	
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

	@Override
	public List<program> getAllPrograms() {
		// TODO Auto-generated method stub
		return null;
	}

}
