package com.nagarro.NagarroTravelPortal.controller;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.NagarroTravelPortal.entity.Ticket;
import com.nagarro.NagarroTravelPortal.entity.User;
@RestController
public class WebController
{
	
	@Autowired
	private EmailService emailService;
	
	 
	private SessionFactory sessionFactory;

	 
		@Autowired
	    public void SomeService(EntityManagerFactory factory) {
	      if(factory.unwrap(SessionFactory.class) == null){
	        throw new NullPointerException("factory is not a hibernate factory");
	      }
	      this.sessionFactory = factory.unwrap(SessionFactory.class);
	    }
	    
	@PostMapping("/forgotpassword")
	public String ForgotPassword(@RequestParam(name = "email", required = true) String email)
	{
//		 emailService.sendMail(email, "Hi", "Aaloo");
         
//	     emailService.sendPreConfiguredMail("Ho ho ho");
	     
		 return "";
	}
	
	@PostMapping("/signup")
	public User signup(@RequestBody User user)
    {
		Session session = getSession();
		session.save(user);
		System.out.println(user);
		return user;
	}
	
	private Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession();
	}

	@PostMapping("/ticketgeneration")
	public Ticket ticketGeneration(@RequestBody Ticket ticket) 
    {
		Session session = getSession();
		session.save(ticket);
		System.out.println(ticket);
		return ticket;
	}
	
	@GetMapping("/signup")
	public String signup() 
	{
		return "";
	}
	
	@PostMapping("/signin")
	public String signin(@RequestParam(name = "username", required = false) String username,
			@RequestParam(name = "password", required = false) String password, Model model)
	{
		return "";
	}
	
}
