package client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HelloDelegate", targetNamespace = "http://remote/")
public interface HelloDelegate {

	/**
	 * 
	 * @return returns byte[]
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getFile", targetNamespace = "http://remote/", className = "client.GetFile")
	@ResponseWrapper(localName = "getFileResponse", targetNamespace = "http://remote/", className = "client.GetFileResponse")
	public byte[] getFile();

	/**
	 * 
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getList", targetNamespace = "http://remote/", className = "client.GetList")
	@ResponseWrapper(localName = "getListResponse", targetNamespace = "http://remote/", className = "client.GetListResponse")
	public List<String> getList();

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "upload", targetNamespace = "http://remote/", className = "client.Upload")
	@ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://remote/", className = "client.UploadResponse")
	public void upload(
			@WebParam(name = "arg0", targetNamespace = "") byte[] arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "say", targetNamespace = "http://remote/", className = "client.Say")
	@ResponseWrapper(localName = "sayResponse", targetNamespace = "http://remote/", className = "client.SayResponse")
	public String say(@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @return returns java.util.List<client.Person>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getPersons", targetNamespace = "http://remote/", className = "client.GetPersons")
	@ResponseWrapper(localName = "getPersonsResponse", targetNamespace = "http://remote/", className = "client.GetPersonsResponse")
	public List<Person> getPersons();

}