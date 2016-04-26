package com.certview.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.certview.repository.Client;
import com.certview.service.ClientService;

@WebService
public class ClientImpl implements ClientService {

  final List<Client> clients;
  
  {
    clients = Arrays.asList(new Client("1","Google"),new Client("2","IBM"),new Client("3","SalesForce"));
  }
  
  
  @Resource
  private WebServiceContext webServiceContext;

  @Override
  @WebMethod
  @WebResult(name="Cliente por codigo")
  public Client getByCode(@WebParam(name = "testName") String code) {
    for(Client client : clients){
      if(code.equals(client.getCode()))
        return client;
    }
    return null;
  }

  @Override
  @WebMethod
  @WebResult(name="Lista de Clientes")
  public List<Client> list() {
    return clients;
  }

  @Override
  @Oneway // it means doesnt have return - see wsdl 
  @WebMethod
  public void insertClient() {
    System.out.println("test");
  }
}