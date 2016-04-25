package com.certview.service;

import java.util.List;

import javax.jws.WebService;

import com.certview.repository.Client;

@WebService
public interface ClientService {

//  List<Client> list();

  Client getByCode(String code);
}
