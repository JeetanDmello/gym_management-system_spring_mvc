package net.project.gms.service;

import java.util.List;

import net.project.gms.entity.program;
import net.project.gms.entity.trainer;

public interface trainerService {
List<trainer> getAllTrainers();
	
	trainer insertTrainer(trainer Trainer);
	
	trainer getTrainerByID(Long trainer_id);
	
	trainer updateTrainer(trainer Trainer);

	void deleteTrainerById(Long id);
	
	List<program> getAllPrograms();
}
