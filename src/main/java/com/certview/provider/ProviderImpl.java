package com.certview.provider;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Provider;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

@WebServiceProvider
@ServiceMode(Mode.PAYLOAD) // default
public class ProviderImpl implements Provider<SOAPMessage> {

  @Override
  public SOAPMessage invoke(SOAPMessage soapMessage) {
    return soapMessage;
  }
}
