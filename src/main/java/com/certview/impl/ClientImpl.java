package com.certview.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebServiceContext;

import com.certview.repository.Client;
import com.certview.service.ClientService;

@WebService
@SOAPBinding(style = Style.RPC)
public class ClientImpl implements ClientService {

  final List<Client> clients = Arrays.asList(new Client("1","Google"),new Client("2","IBM"),new Client("3","SalesForce")); 
  
  @Resource
  private WebServiceContext webServiceContext;

  @Override
  @RolesAllowed("basicUser")
  public Client getByCode(String code) {
    for(Client client : clients){
      if(code.equals(client.getCode()))
        return client;
    }
    return null;
  }
}