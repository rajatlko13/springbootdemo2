package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootdemo.entity.AdminDetails;
import com.example.springbootdemo.repository.AdminRepo;

@Controller
public class MyController {
	
	@Autowired
	AdminRepo adminRepo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/adminPage")
	public String employees(Model theModel)
	{
		theModel.addAttribute("admin1", adminRepo.findById("rajatlko13").orElse(null));
		return "AdminPage.jsp";
	}

}
