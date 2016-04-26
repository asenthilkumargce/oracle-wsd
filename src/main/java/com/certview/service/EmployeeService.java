package com.certview.service;

import java.util.List;

import com.certview.repository.Employee;

public interface EmployeeService {
  
  List<Employee> list();
  
  Employee findById(String id);

}
