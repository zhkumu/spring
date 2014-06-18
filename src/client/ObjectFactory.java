package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetFile_QNAME = new QName("http://remote/",
			"getFile");
	private final static QName _SayResponse_QNAME = new QName("http://remote/",
			"sayResponse");
	private final static QName _GetPersons_QNAME = new QName("http://remote/",
			"getPersons");
	private final static QName _GetFileResponse_QNAME = new QName(
			"http://remote/", "getFileResponse");
	private final static QName _GetPersonsResponse_QNAME = new QName(
			"http://remote/", "getPersonsResponse");
	private final static QName _GetList_QNAME = new QName("http://remote/",
			"getList");
	private final static QName _GetListResponse_QNAME = new QName(
			"http://remote/", "getListResponse");
	private final static QName _Say_QNAME = new QName("http://remote/", "say");
	private final static QName _UploadResponse_QNAME = new QName(
			"http://remote/", "uploadResponse");
	private final static QName _Upload_QNAME = new QName("http://remote/",
			"upload");
	private final static QName _UploadArg0_QNAME = new QName("", "arg0");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetList }
	 * 
	 */
	public GetList createGetList() {
		return new GetList();
	}

	/**
	 * Create an instance of {@link Say }
	 * 
	 */
	public Say createSay() {
		return new Say();
	}

	/**
	 * Create an instance of {@link UploadResponse }
	 * 
	 */
	public UploadResponse createUploadResponse() {
		return new UploadResponse();
	}

	/**
	 * Create an instance of {@link GetFileResponse }
	 * 
	 */
	public GetFileResponse createGetFileResponse() {
		return new GetFileResponse();
	}

	/**
	 * Create an instance of {@link SayResponse }
	 * 
	 */
	public SayResponse createSayResponse() {
		return new SayResponse();
	}

	/**
	 * Create an instance of {@link GetListResponse }
	 * 
	 */
	public GetListResponse createGetListResponse() {
		return new GetListResponse();
	}

	/**
	 * Create an instance of {@link GetPersonsResponse }
	 * 
	 */
	public GetPersonsResponse createGetPersonsResponse() {
		return new GetPersonsResponse();
	}

	/**
	 * Create an instance of {@link GetFile }
	 * 
	 */
	public GetFile createGetFile() {
		return new GetFile();
	}

	/**
	 * Create an instance of {@link Person }
	 * 
	 */
	public Person createPerson() {
		return new Person();
	}

	/**
	 * Create an instance of {@link Upload }
	 * 
	 */
	public Upload createUpload() {
		return new Upload();
	}

	/**
	 * Create an instance of {@link GetPersons }
	 * 
	 */
	public GetPersons createGetPersons() {
		return new GetPersons();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetFile }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getFile")
	public JAXBElement<GetFile> createGetFile(GetFile value) {
		return new JAXBElement<GetFile>(_GetFile_QNAME, GetFile.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SayResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "sayResponse")
	public JAXBElement<SayResponse> createSayResponse(SayResponse value) {
		return new JAXBElement<SayResponse>(_SayResponse_QNAME,
				SayResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getPersons")
	public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
		return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetFileResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getFileResponse")
	public JAXBElement<GetFileResponse> createGetFileResponse(
			GetFileResponse value) {
		return new JAXBElement<GetFileResponse>(_GetFileResponse_QNAME,
				GetFileResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetPersonsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getPersonsResponse")
	public JAXBElement<GetPersonsResponse> createGetPersonsResponse(
			GetPersonsResponse value) {
		return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME,
				GetPersonsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getList")
	public JAXBElement<GetList> createGetList(GetList value) {
		return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "getListResponse")
	public JAXBElement<GetListResponse> createGetListResponse(
			GetListResponse value) {
		return new JAXBElement<GetListResponse>(_GetListResponse_QNAME,
				GetListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Say }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "say")
	public JAXBElement<Say> createSay(Say value) {
		return new JAXBElement<Say>(_Say_QNAME, Say.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "uploadResponse")
	public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
		return new JAXBElement<UploadResponse>(_UploadResponse_QNAME,
				UploadResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://remote/", name = "upload")
	public JAXBElement<Upload> createUpload(Upload value) {
		return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "arg0", scope = Upload.class)
	public JAXBElement<byte[]> createUploadArg0(byte[] value) {
		return new JAXBElement<byte[]>(_UploadArg0_QNAME, byte[].class,
				Upload.class, ((byte[]) value));
	}

}
