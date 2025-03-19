package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Service.MyServices;
import com.example.demo.Model.Feedback;

@RestController
//@Controller
public class MyController {
	
	@Autowired
	private MyServices mySer;
	
	@GetMapping("/home")
	public String homepage() {
		return "<h1> Welcome to Middle layer </h1>";
		
	}

	@GetMapping("/getFeedback")
	public List<Feedback> getFeedback() {

		System.out.print("..Feedback in MyController...");

		List<Feedback> frs= new ArrayList<>();

		frs=mySer.fetchFeedbackList();
		return frs;
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {

		System.out.print("..AllProducts in MyController...");

		List<Product> prs= new ArrayList<>();

		prs=mySer.fetchProductList();
		return prs;
	}

}
