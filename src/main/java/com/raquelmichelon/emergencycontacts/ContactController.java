package com.raquelmichelon.emergencycontacts;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactController {
	
	private static final ArrayList<Contact> CONTACTS = new ArrayList<>();
	
	//static block to mock data
	static {
		CONTACTS.add(new Contact("1", "Carlos", "+351 999 999 999"));
		CONTACTS.add(new Contact("2", "Regina", "+351 999 999 999"));
		CONTACTS.add(new Contact("3", "Sarah", "+351 999 999 999"));
		CONTACTS.add(new Contact("4", "Maria", "+351 999 999 999"));
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
