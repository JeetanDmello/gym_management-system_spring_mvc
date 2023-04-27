package net.project.gms.service;

import java.util.List;

import net.project.gms.entity.payment;
import net.project.gms.entity.program;
import net.project.gms.entity.user;

public interface userService {
	
	//-------------------------------------------
	List<user> getAllUsers();
	
	user insertUser(user User);
	
	user getUserByID(Long user_id);
	
	user updateUser(user User);

	void deleteUserById(Long id);
	
	//-------------------------------------------
	List<program> getAllPrograms();
	
	List<payment> getAllPayment();
	
	payment insertPayment(payment Payment);
	
	payment getPaymentByID(Long payment_id);
	
	payment updatePayment(payment Payment);

	void deletePaymentById(Long id);
}
