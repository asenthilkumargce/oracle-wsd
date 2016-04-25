import javax.xml.ws.WebServiceRef;

import com.certview.service.ClientService;

public class ClientTest {

  @WebServiceRef(wsdlLocation = "http://localhost:8080/wsd/client?wsdl")
  static ClientService service;

  public static void main(String... args) {
    try {

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
