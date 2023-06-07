package springmvc.crudoperation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.crudoperation.restrodao.RestroDAO;

@Controller
public class MainController {

	@Autowired
	private RestroDAO restroDao;

	@RequestMapping("/")
	public String home() {

		return "index";
	}

	@RequestMapping("/menulist")
	public String additem(Model m) {

		List<Menu> menus = restroDao.getList();

		m.addAttribute("Menu", menus);

		return "menulist";
	}

//	handling add product form
	@RequestMapping(value = "/menulist", method = RequestMethod.POST)
	public RedirectView menuhandle(@ModelAttribute Menu menu, HttpServletRequest req) {
		restroDao.createList(menu);

		RedirectView redirect = new RedirectView();
		redirect.setUrl(req.getContextPath() + "/menulist");

		return redirect;

	}

	@RequestMapping("/update/{itemid}")
	public String updateItem(@PathVariable("itemid") int itemid, Model model) {
		Menu menuitem = this.restroDao.getItemDetail(itemid);
		model.addAttribute("items" ,menuitem);
		System.out.println("Menu item clicks");

		return "menulist";
	}

	@RequestMapping("/delete/{itemid}")
	public RedirectView deleteItem(@PathVariable("itemid") int itemid, HttpServletRequest req) {

		this.restroDao.deleteItem(itemid);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl(req.getContextPath() + "/menulist");

		return redirect;
	}

}
