	package springmvc.complexform.hibernateorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.complexform.controller.Passanger;

@Repository
public class TrainDAO {
	@Autowired
	@Qualifier("template")
	private HibernateTemplate template;
	
	
	
	@Transactional
	public int saveUser(Passanger passanger) {
		System.out.println("i am in save user");
	int id = (Integer) this.template.save(passanger);

	System.out.println("i am in save user completed	");

	return id;
	}
	
}
