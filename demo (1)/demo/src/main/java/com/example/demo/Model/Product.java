
  package com.example.demo.Model;
  
  
  import jakarta.persistence.Column;
  
  import jakarta.persistence.Entity;
  
  import jakarta.persistence.Id;
  
  import jakarta.persistence.Table;
  
  @Entity
  
  @Table(name="Product")
  
  public class Product {
  
  
  
  @Id
  
  private int id;
  
  @Column(name="productname")
  
  private String name;
  
  @Column(name="Description")
  
  private String desc;
  
  private int price;
  
  public Product() { System.out.print("..Print 3..."); }
  
  
  public int getId() {
  
  return id;
  
  }
  
  public void setId(int id) {
  
  this.id = id;
  
  }
  
  public String getName() {
  
  return name;
  
  }
  
  public void setName(String name) {
  
  this.name = name;
  
  }
  
  public String getDesc() {
  
  return desc;
  
  }
  
  public void setDesc(String desc) {
  
  this.desc = desc;
  
  }
  
  public int getPrice() {
  
  return price;
  
  }
  
  public void setPrice(int price) {
  
  this.price = price;
  
  }
  
  }
 