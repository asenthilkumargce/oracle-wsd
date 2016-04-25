package com.certview.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.certview.repository.Client;
import com.certview.service.ClientService;

@WebService
@SOAPBinding(style = Style.RPC)
public class ClientImpl implements ClientService {

  final List<Client> clients = Arrays.asList(new Client("1","Google"),new Client("2","IBM"),new Client("3","SalesForce")); 
  
  @Resource
  private WebServiceContext webServiceContext;

//  @Override
  public String client() {
    MessageContext mc = webServiceContext.getMessageContext();
    ServletContext servletContext = (ServletContext) mc.get(MessageContext.SERVLET_CONTEXT);
    return "";
  }

//  @Override
//  public List<Client> list() {
//    return clients;
//  }

  @Override
  public Client getByCode(String code) {
    for(Client client : clients){
      if(code.equals(client.getCode()))
        return client;
    }
    return null;
  }
}