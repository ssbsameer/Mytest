package com.example.demo.Service;

import com.example.demo.Model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.MyRepo;
import com.example.demo.Model.Product;
import java.util.List;
import com.example.demo.Repo.MyFeedbackRepo;
@Service
public class MyServices {

	@Autowired
	private MyRepo repo;
	private  MyFeedbackRepo frepo;

    public MyServices(MyFeedbackRepo frepo) {
        this.frepo = frepo;
    }

    public List<Product> fetchProductList(){
		System.out.print("..Product MyServices ...");
		return repo.findAll();
	}
	public List<Feedback> fetchFeedbackList(){
		System.out.print("..Feedback MyServices ...");
		return frepo.findAll();
	}
}
