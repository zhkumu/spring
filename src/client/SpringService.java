package client;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "springService", targetNamespace = "http://remote/")
public interface SpringService {
	@WebMethod
	String say();
}
