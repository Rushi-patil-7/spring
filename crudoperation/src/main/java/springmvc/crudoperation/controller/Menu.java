package springmvc.crudoperation.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemid;
	private String itemName;
	private String itemPrice;
	private String categeory;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getcategeory() {
		return categeory;
	}
	public void setcategeory(String categeory) {
		this.categeory = categeory;
	}
	@Override
	public String toString() {
		return "Menu [itemid=" + itemid + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", categeory="
				+ categeory + "]";
	}
	
	public Menu(int itemid, String itemName, String itemPrice, String categeory) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.categeory = categeory;
	}
	public Menu() {
		super();
	}
	
	
}
