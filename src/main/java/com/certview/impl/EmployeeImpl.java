package com.certview.impl;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.certview.repository.Employee;
import com.certview.service.EmployeeService;

@Path(value = "/employee")
public class EmployeeImpl implements EmployeeService {

  final List<Employee> employees;
  
  {
    employees = Arrays.asList
        (
          new Employee("1", "John")
         ,new Employee("2", "Paul")
         ,new Employee("3", "Smith")
         ,new Employee("4", "Brian")
         ,new Employee("5", "Nathan")
         ,new Employee("6", "Sansa")
         ,new Employee("7", "Jon Snow")
        );
  }
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Employee getTest2() {
    return new Employee("007", "Thiago");
}
  
  @Produces(MediaType.APPLICATION_XML)
  @GET
  public List<Employee> getTest() {
    return employees;
  }
  
  
  @Override
  @Produces(MediaType.APPLICATION_JSON)
  @Path(value = "/list")
  @GET
  public List<Employee> list() {
    return employees;
  }


  @Override
  @Path(value = "{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Employee findById(@PathParam("id") String id) {
    for(Employee employee : employees){
      if(employee.getId().equals(id)){
        return employee;
      }
    }
    return null;
  }
}