package com.example.demo.Repo;

import com.example.demo.Model.Feedback;
import com.example.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyFeedbackRepo extends JpaRepository<Feedback, Integer>  {
}
