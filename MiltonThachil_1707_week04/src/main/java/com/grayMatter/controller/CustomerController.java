package com.grayMatter.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Customer;
import com.grayMatter.model.Orders;
import com.grayMatter.service.CustomerService;
import com.grayMatter.service.OrderService;



@Controller
//@ResponseBody
public class CustomerController {

	
	@Autowired
	private CustomerService service;
	@Autowired
	private OrderService service1;
	
	@RequestMapping("/welcome")
	public ModelAndView welcome1() {
		
		ModelAndView we=new ModelAndView("welcome");
		return we;
	}
	@RequestMapping(value = "/OR", method = RequestMethod.POST)
	public ModelAndView viewOrders(@RequestParam("id") int Id) {
	   
	    List<Orders> orders = service1.getOrdersByCustomerId(Id);
	    ModelAndView mv = new ModelAndView("viewOrder");
	    mv.addObject("orders", orders);
	    return mv;
	}
	@RequestMapping( "/VO")
	public ModelAndView viewOrders1() {
	   
	    List<Orders> orders = service1.getOrders();
	    ModelAndView mv = new ModelAndView("viewOrder");
	    mv.addObject("orders", orders);
	    return mv;
	}
	
	@RequestMapping("/back")
	public ModelAndView welcome() {
		ModelAndView we=new ModelAndView("welcome");
		return we;
	}
	@RequestMapping("/UC")
	public ModelAndView UP() {
		ModelAndView we=new ModelAndView("updateCustomer");
		return we;
	}
	@RequestMapping("/DC")
	public ModelAndView DC() {
		ModelAndView we=new ModelAndView("deleteCustomer");
		return we;
	}
	@RequestMapping("/GEI")
	public ModelAndView GEI() {
		ModelAndView we=new ModelAndView("getById");
		return we;
	}
	@RequestMapping("/doLogin")
	public ModelAndView doLogin() {
		ModelAndView we=new ModelAndView("login");
		return we;
	} 
	@RequestMapping("/AC")
	public ModelAndView AC() {
		ModelAndView we=new ModelAndView("addCustomer");
		return we;
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String email,@RequestParam String pwd) {
		
		List<Customer> cusList=service.getAllCustomer();
		
		ModelAndView mv=null;
			for(Customer cus:cusList.subList(1, cusList.size())) {
			
			if(email.equals(cus.getEmail())&&pwd.equals(cus.getPwd())) {
				mv=new ModelAndView("customer");
				mv.addObject("name",cus.getName());
				mv.addObject("cus",cus);
				return mv;
			}
	
		}

		 if(email.equals("ponner@gmail.com")&&pwd.equals("1234")) {
			mv=new ModelAndView("admin");
			
				mv.addObject("name",cusList.get(0).getName());
				mv.addObject("cus",cusList.get(0));
				return mv;
			
		}
		 else {
				
				mv=new ModelAndView("login");
				return mv;
			      }

	}
	
	@RequestMapping("/VC")
	public ModelAndView getAllCustomer(){
		
		List<Customer> cusList=service.getAllCustomer();
		for(Customer cus:cusList)
			System.out.println(cus);
		ModelAndView mv=new ModelAndView("viewCustomer");
		mv.addObject("cus",cusList);
		return mv;
	}
	
	@RequestMapping("/displayID")
	public ModelAndView displayID(@RequestParam String Id){
		
		List<Customer> cus=service.getCustomerById(Integer.parseInt(Id));
		 ModelAndView mv=new ModelAndView("customer");
		 mv.addObject("cus",cus);
		return mv;
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(@RequestParam String Id,@RequestParam String Name,
			@RequestParam String Email,@RequestParam String pwd)
	{
	    service.updateCustomer(new Customer(Integer.parseInt(Id),Name,Email,pwd));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteCustomer(@RequestParam String Id)
	{
	    service.deleteCustomer(Integer.parseInt(Id));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(@RequestParam String Id,@RequestParam String Name,
			@RequestParam String Email,@RequestParam String pwd)
	{
		service.addCustomer(new Customer(Integer.parseInt(Id),Name,Email,pwd));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	@RequestMapping("/signUP")
	public ModelAndView signUP(@RequestParam String Id,@RequestParam String Name,
			@RequestParam String Email,@RequestParam String pwd)
	{
		service.addCustomer(new Customer(Integer.parseInt(Id),Name,Email,pwd));
	    ModelAndView mv1=new ModelAndView("signedIn");
		return mv1;
	}
	@RequestMapping("/UO")
	public ModelAndView UO() {
		ModelAndView we=new ModelAndView("updateOrder");
		return we;
	}
	@RequestMapping("/updateOrder")
	public ModelAndView updateOrder(@RequestParam String Id,@RequestParam String Date12,
			@RequestParam String Total,@RequestParam String orderId)
	{
		Date d1=Date.valueOf(Date12);
	    service1.updateOrder(new Orders(Integer.parseInt(Id),d1,Double.parseDouble(Total),Integer.parseInt(orderId)));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	@RequestMapping("/DO")
	public ModelAndView DO() {
		ModelAndView we=new ModelAndView("deleteOrder");
		return we;
	}
	@RequestMapping("/deleteOrder")
	public ModelAndView deleteOrder(@RequestParam String orderId,@RequestParam String customerId)
	{
	    service1.deleteOrder(Integer.parseInt(orderId),Integer.parseInt(customerId));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	@RequestMapping(value = "/CNO", method = RequestMethod.POST)
	public ModelAndView CNO(@RequestParam("id") int Id) {
		ModelAndView we=new ModelAndView("placeOrder");
		we.addObject("id",Id);
		return we;
	}
	@RequestMapping("/placeOrder")
	public ModelAndView placeOrder(@RequestParam String orderId,@RequestParam String Date12,
			@RequestParam String Total,@RequestParam("id")int Id)
	{
		Date d1=Date.valueOf(Date12);
		service1.placeOrder(new Orders(Integer.parseInt(orderId),d1,Double.parseDouble(Total),Id));
	    ModelAndView mv=new ModelAndView("orderPlaced");
		return mv;
	}
	@RequestMapping(value ="/UO1", method = RequestMethod.POST)
	public ModelAndView UO1(@RequestParam("id") int Id) {
		ModelAndView we=new ModelAndView("updateOrder1");
		we.addObject("id",Id);
		return we;
	}
	@RequestMapping("/updateOrder1")
	public ModelAndView updateOrder1(@RequestParam("id")int Id,@RequestParam String Date12,
			@RequestParam String Total,@RequestParam String orderId)
	{
		Date d1=Date.valueOf(Date12);
	    service1.updateOrder(new Orders(Id,d1,Double.parseDouble(Total),Integer.parseInt(orderId)));
	    ModelAndView mv=new ModelAndView();
		return mv;
	}
	@RequestMapping(value = "/VPD", method = RequestMethod.POST)
	public ModelAndView VPD(@RequestParam("id") int Id) {
		List<Customer> cus = service.getCustomerById(Id);
		ModelAndView we=new ModelAndView("viewCustomer");
		we.addObject("cus", cus);
		return we;
	}

	@RequestMapping("/DS")
	public ModelAndView DS() {
		ModelAndView we=new ModelAndView("signUp");
		return we;
	}
}

 