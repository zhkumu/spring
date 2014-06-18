package client;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "EaopServer", targetNamespace = "http://eaop.gd.chinamobile.com")
public interface EaopServer {
	
	@WebMethod
	String handle(String str);
}
