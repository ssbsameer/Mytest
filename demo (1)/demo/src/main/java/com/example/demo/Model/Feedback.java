package com.example.demo.Model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

import jakarta.persistence.*;


@Entity

@Table(name="Feedback")

/*
FeedbackID INT PRIMARY KEY,
ProductID INT,
CustomerName VARCHAR(100),
Rating INT CHECK (Rating BETWEEN 1 AND 5),
Comments TEXT
*/

public class Feedback {

    @Id
    @Column(name = "FeedbackID")
    private Integer feedbackId;

    @Column(name = "ProductID", nullable = false)
    private Integer productId;

    @Column(name = "CustomerName", nullable = false, length = 100)
    private String customerName;

    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Column(name = "Comments")
    private String comments;

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
