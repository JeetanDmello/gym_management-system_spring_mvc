package net.project.gms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.project.gms.entity.trainer;

public interface trainerRepository extends JpaRepository<trainer, Long>{
	trainer findByName(String name);
}
