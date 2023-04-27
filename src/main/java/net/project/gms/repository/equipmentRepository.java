package net.project.gms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.project.gms.entity.equipment;

public interface equipmentRepository extends JpaRepository<equipment, Long>{
	equipment findByName(String name);
}
