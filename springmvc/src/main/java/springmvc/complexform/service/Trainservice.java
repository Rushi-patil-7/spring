package springmvc.complexform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.complexform.controller.Passanger;
import springmvc.complexform.hibernateorm.dao.TrainDAO;

@Service
public class Trainservice {
	
	@Autowired
	private TrainDAO train;
	
	public int createPassanger(Passanger passanger) {
		System.out.println("i am iin create passanger");
		return this.train.saveUser(passanger);
	}
	
}
