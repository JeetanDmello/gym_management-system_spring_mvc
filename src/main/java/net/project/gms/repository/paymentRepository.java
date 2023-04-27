package net.project.gms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.project.gms.entity.payment;

public interface paymentRepository extends JpaRepository<payment, Long>{
	payment findByUserid(Long user_id);
}	
