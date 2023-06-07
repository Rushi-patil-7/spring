package springmvc.crudoperation.restrodao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springmvc.crudoperation.controller.Menu;

@Component
public class RestroDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createList(Menu menulist) {
		
		this.hibernateTemplate.saveOrUpdate(menulist);
	}
	
	public void createCategeory(Menu newCategeory) {
		
		this.hibernateTemplate.save(newCategeory);
	}
	
	//get menu list
	public List<Menu> getList(){
	List<Menu> getList=	this.hibernateTemplate.loadAll(Menu.class);
	System.out.println(getList);
	return getList;
	}
	
	// Delete Item from Menu
	@Transactional
	public void deleteItem(int itemid) {
	Menu item =	this.hibernateTemplate.load(Menu.class , itemid);
	this.hibernateTemplate.delete(item);
	}
	
	//Get a Single Entity
	public Menu getItemDetail(int itemid) {
		return this.hibernateTemplate.load(Menu.class, itemid);	
	}
	
	
}
