package com.certview.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.certview.repository.Client;

@WebService
public interface ClientService {

  @WebMethod
  List<Client> list();

  @WebMethod
  Client getByCode(String code);
  
  @WebMethod
  void insertClient();
}
