package net.project.gms;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.project.gms.repository.userRepository;

@SpringBootApplication
public class GymManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GymManagementSystemApplication.class, args);
	}
	
	@Autowired
	private userRepository user_repository;

	@Override
	public void run(String... args) throws Exception {

	}
}
