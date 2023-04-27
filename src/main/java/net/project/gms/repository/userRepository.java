package net.project.gms.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.project.gms.entity.user;

public interface userRepository extends JpaRepository<user, Long>{
	user findByName(String name);
}