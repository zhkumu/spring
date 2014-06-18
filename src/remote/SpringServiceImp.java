package remote;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="springService")
public class SpringServiceImp implements SpringService {

	@WebMethod
	@Override
	public String say() {
		return "hello spring";
	}

}
