package com.certview.repository;

public class Employee {

  private String id;
  
  private String firstName;
  
  public Employee(String id, String firstName){
    this.id = id;
    this.firstName = firstName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
