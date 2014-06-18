package remote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebMethod;
import javax.jws.WebService;

@javax.jws.WebService(targetNamespace = "http://remote/", serviceName = "HelloService", portName = "HelloPort", wsdlLocation = "WEB-INF/wsdl/HelloService.wsdl")
public class HelloDelegate {

	remote.Hello hello = new remote.Hello();

	public String say(String name) {
		return hello.say(name);
	}

	public List<String> getList() {
		return hello.getList();
	}

	public List<Person> getPersons() {
		return hello.getPersons();
	}

	public void upload(byte[] bytes, String filename) {
		hello.upload(bytes, filename);
	}

	public DataHandler getFile() {
		return hello.getFile();
	}

}